package aquarium.core;

import aquarium.entities.aquariums.Aquarium;
import aquarium.entities.aquariums.FreshwaterAquarium;
import aquarium.entities.aquariums.SaltwaterAquarium;
import aquarium.entities.decorations.Decoration;
import aquarium.entities.decorations.Ornament;
import aquarium.entities.decorations.Plant;
import aquarium.entities.fish.Fish;
import aquarium.entities.fish.FreshwaterFish;
import aquarium.repositories.DecorationRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static aquarium.common.ConstantMessages.*;
import static aquarium.common.ExceptionMessages.*;

public class ControllerImpl implements Controller{
    private DecorationRepository decorations;
    private List<Aquarium> aquariums;

    public ControllerImpl(){
        this.decorations = new DecorationRepository();
        this.aquariums = new ArrayList<>();
    }

    @Override
    public String addAquarium(String aquariumType, String aquariumName) {
        Aquarium aquarium;
        switch (aquariumType){
            case "SaltwaterAquarium":
                aquarium = new SaltwaterAquarium(aquariumName);
                aquariums.add(aquarium);
                return "Successfully added "+ aquariumType +".";
            case "FreshwaterAquarium":
                aquarium = new FreshwaterAquarium(aquariumName);
                aquariums.add(aquarium);
                return "Successfully added "+ aquariumType +".";
            default:
                throw new NullPointerException(INVALID_AQUARIUM_TYPE);
        }
    }

    @Override
    public String addDecoration(String type) {
        Decoration decoration;
        switch (type){
            case "Ornament":
                decoration = new Ornament();
                decorations.add(decoration);
                return "Successfully added "+ type +".";
            case "Plant":
                decoration = new Plant();
                decorations.add(decoration);
                return "Successfully added "+ type +".";
            default:
                throw new IllegalArgumentException(INVALID_DECORATION_TYPE);
        }
    }

    @Override
    public String insertDecoration(String aquariumName, String decorationType) {
        Decoration decoration = this.decorations.findByType(decorationType);
        Aquarium currentAquarium = null;
        for (Aquarium aquarium : aquariums) {
            if (aquarium.getName().equals(aquariumName)) {
                currentAquarium = aquarium;
            }
        }

        if (decoration == null) {
            throw new IllegalArgumentException(String.format(NO_DECORATION_FOUND, decorationType));
        }

        currentAquarium.addDecoration(decoration);

        this.decorations.remove(decoration);
        return String.format(SUCCESSFULLY_ADDED_DECORATION_IN_AQUARIUM, decorationType, aquariumName);
    }

    @Override
    public String addFish(String aquariumName, String fishType, String fishName, String fishSpecies, double price) {
        Aquarium current = null;
        for (Aquarium aquarium : aquariums) {
            if(aquarium.getName().equals(aquariumName)){
                current = aquarium;
                break;
            }
        }

        switch (fishType){
            case "FreshwaterFish":
                if (current != null && current.getClass().getSimpleName().equals("FreshwaterAquarium")) {
                    current.addFish(new FreshwaterFish(fishName, fishSpecies, price));
                }else {
                    return "Water not suitable.";
                }
                break;

            case "SaltwaterFish":
                if (current != null && current.getClass().getSimpleName().equals("SaltwaterAquarium")) {
                    current.addFish(new FreshwaterFish(fishName, fishSpecies, price));
                }else {
                    return "Water not suitable.";
                }
                break;

            default:
                throw new IllegalArgumentException("Invalid fish type.");
        }
        return String.format("Successfully added %s to %s.", fishType, aquariumName);
    }

    @Override
    public String feedFish(String aquariumName) {
        int sum = 0;
        for (Aquarium aquarium1 : aquariums) {
            if(aquariumName.equals(aquarium1.getName())){
                aquarium1.feed();
                sum = aquarium1.getFish().size();
                break;
            }
        }
        return "Fish fed: " + sum;
    }

    @Override
    public String calculateValue(String aquariumName) {
        double sum = 0;

        for (Aquarium aquarium : aquariums) {
            if(aquarium.getName().equals(aquariumName)){
                //List<Decoration> decs1= (List<Decoration>) aquarium.getDecorations();
                Collection<Decoration> decs = aquarium.getDecorations();
                Collection<Fish> fishs = aquarium.getFish();
                for (Decoration dec : decs) {
                    sum += dec.getPrice();
                }

                for (Fish fish : fishs) {
                    sum += fish.getPrice();
                }
            }
        }
        return String.format("The value of Aquarium %s is %.2f.", aquariumName, sum);
    }

    @Override
    public String report() {
        StringBuilder sb = new StringBuilder();
        for (Aquarium aquarium : aquariums) {
            sb.append(aquarium.getInfo());
            sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
