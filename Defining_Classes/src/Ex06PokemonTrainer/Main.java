package Ex06PokemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (!input.equals("Tournament")){
            String[] tokens = input.split("\\s+");

            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            trainers.putIfAbsent(trainerName, new Trainer(trainerName));

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            trainers.get(trainerName).addPokemon(pokemon);


            input = scanner.nextLine();
        }

        while (!input.equals("End")){
            for (Map.Entry<String, Trainer> trainer : trainers.entrySet()) {
                String element = input;

                List<Pokemon> pokemonsWithElement = trainer
                        .getValue()
                        .getPokemons()
                        .stream()
                        .filter(p -> p.getElement().equals(element))
                        .collect(Collectors.toList());

                if (!pokemonsWithElement.isEmpty()){
                    trainer.getValue().addBadge();
                } else {
                    trainer.getValue().getPokemons().forEach(Pokemon::reduceHealth);

                    trainer
                            .getValue()
                            .setPokemons(trainer
                                    .getValue()
                                    .getPokemons()
                                    .stream()
                                    .filter(p -> p.getHealth() >= 0)
                                    .collect(Collectors.toList()));
                }
            }

            input = scanner.nextLine();
        }

        Comparator<Map.Entry<String, Trainer>> sortTrainers = (first, second) -> {
            int firstValue = first.getValue().getNumberOfBadges();
            int secondValue = second.getValue().getNumberOfBadges();

            return secondValue - firstValue;
        };

        trainers
                .entrySet()
                .stream()
                .sorted(sortTrainers)
                .forEach(t -> System.out.printf("%s %d %d%n",
                        t.getKey(),
                        t.getValue().getNumberOfBadges(),
                        t.getValue().getPokemons().size()));
    }
}
