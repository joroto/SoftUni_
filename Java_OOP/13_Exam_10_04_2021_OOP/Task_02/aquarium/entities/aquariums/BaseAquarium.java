package aquarium.entities.aquariums;

import aquarium.entities.decorations.Decoration;
import aquarium.entities.fish.Fish;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static aquarium.common.ConstantMessages.*;
import static aquarium.common.ExceptionMessages.*;

public abstract class BaseAquarium implements Aquarium {
    private String name;
    private int capacity;
    private List<Decoration> decorations;
    private List<Fish> fish;

    protected BaseAquarium(String name, int capacity) {
        setName(name);
        setCapacity(capacity);
        this.decorations = new ArrayList<>();
        this.fish = new ArrayList<>();
    }

    private void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new NullPointerException(AQUARIUM_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private void setDecorations(List<Decoration> decorations) {
        this.decorations = decorations;
    }

    private void setFish(List<Fish> fish) {
        this.fish = fish;
    }

    @Override
    public int calculateComfort() {
        int sum = 0;
        for (Decoration decoration : decorations) {
            sum += decoration.getComfort();
        }
        return sum;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addFish(Fish fish) {
        if(capacity > 0){
            this.fish.add(fish);
            this.capacity--;
        }else {
            throw new IllegalStateException(NOT_ENOUGH_CAPACITY);
        }
    }

    @Override
    public void removeFish(Fish fish) {
        this.fish.remove(fish);
    }

    @Override
    public void addDecoration(Decoration decoration) {
        this.decorations.add(decoration);
    }

    @Override
    public void feed() {
        for (Fish fish1 : fish) {
            fish1.eat();
        }
    }

    @Override
    public String getInfo() {

        StringBuilder fish = new StringBuilder();

        if(this.fish.size() > 0){
            for (Fish fish1 : this.fish) {
                fish.append(fish1.getName()).append(" ");
            }
           fish = new StringBuilder(fish.toString().trim());
        }
        if(fish.toString().isEmpty()){
            return String.format("%s (%s):\n" +
                    "Fish: none\n" +
                    "Decorations: %s\n" +
                    "Comfort: %s", this.name, this.decorations.size(), this.calculateComfort());
        }

        return String.format("%s (%s):\n" +
                "Fish: %s\n" +
                "Decorations: %s\n" +
                "Comfort: %s", this.name, this.getClass().getSimpleName(), fish, this.decorations.size(), this.calculateComfort());
    }

    @Override
    public Collection<Fish> getFish() {
        return this.fish;
    }

    @Override
    public Collection<Decoration> getDecorations() {
        return this.decorations;
    }
}
