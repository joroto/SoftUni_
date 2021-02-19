package Pokemon_Trainer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trainer {
    private String name;
    private int badgesCount;
    private List<Pokemon> pokemons;

    public Trainer() {
        this.badgesCount = 0;
        this.pokemons = new ArrayList<>();
    }

    public int getBadgesCount() {
        return badgesCount;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void addBadge(int badge){
        this.badgesCount += badge;
    }

    public void removeDead(){
        this.pokemons = this.pokemons
                .stream()
                .filter(pokemon -> pokemon.getHealth() > 0)
                .collect(Collectors.toList());
    }
}
