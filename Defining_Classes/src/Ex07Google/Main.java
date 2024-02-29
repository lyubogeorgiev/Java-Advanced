package Ex07Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> people = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] inputTokens = input.split("\\s+");

            String personName = inputTokens[0];
            people.putIfAbsent(personName, new Person(personName));

            switch (inputTokens[1]){
                case "company":
                    people
                            .get(personName)
                            .setCompany(new Company(inputTokens[2], inputTokens[3], Double.parseDouble(inputTokens[4])));
                    break;
                case "pokemon":
                    people
                            .get(personName)
                            .addPokemon(new Pokemon(inputTokens[2], inputTokens[3]));
                    break;
                case "parents":
                    people
                            .get(personName)
                            .addParent(new Relative(inputTokens[2], inputTokens[3]));
                    break;
                case "children":
                    people
                            .get(personName)
                            .addChild(new Relative(inputTokens[2], inputTokens[3]));
                    break;
                case "car":
                    people
                            .get(personName)
                            .setCar(new Car(inputTokens[2], Integer.parseInt(inputTokens[3])));
                    break;
            }

            input = scanner.nextLine();
        }

        String searchPerson = scanner.nextLine();

        System.out.println(people.get(searchPerson));
    }
}
