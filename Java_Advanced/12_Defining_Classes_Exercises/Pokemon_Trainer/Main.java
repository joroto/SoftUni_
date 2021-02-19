package Pokemon_Trainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;
        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (!(input = scan.nextLine()).equals("Tournament")) {
            String[] tokens = input.split("\\s+");

            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            trainers.putIfAbsent(trainerName, new Trainer());

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            trainers.get(trainerName).getPokemons().add(pokemon);
        }

        String input2;
        while (!(input2 = scan.nextLine()).equals("End")) {

            for (Map.Entry<String, Trainer> trainer : trainers.entrySet()) {
                if (!hasOne(trainer.getValue().getPokemons(), input2)) {
                    deal10Damage(trainer);
                    trainer.getValue().removeDead();
                }else {
                    trainer.getValue().addBadge();
                }
            }
        }

        trainers.entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue().getBadgesCount(), a.getValue().getBadgesCount()))
                .forEach(e -> System.out.printf("%s %d %d\n", e.getKey(), e.getValue().getBadgesCount(), e.getValue().getPokemons().size()));
    }

    private static void deal10Damage(Map.Entry<String, Trainer> trainer) {
        trainer.getValue().getPokemons().forEach(p -> {
            p.setHealth(p.getHealth() - 10);
        });
    }

    public static boolean hasOne(List<Pokemon> pokemons, String element) {
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getElement().equals(element)) {
                return true;
            }
        }
        return false;
    }
}
