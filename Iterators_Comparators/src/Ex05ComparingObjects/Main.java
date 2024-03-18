package Ex05ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("END")){
            String[] tokens = input.split("\\s+");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String town = tokens[2];

            Person person = new Person(name, age, town);

            people.add(person);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        int indexToCompare = Integer.parseInt(input) - 1;

        int number_of_people_equal = (int) people.stream().filter(p -> (p.compareTo(people.get(indexToCompare)) == 0)).count();
        int number_of_not_equal = people.size() - number_of_people_equal;

        if (number_of_people_equal == 1){
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d%n", number_of_people_equal, number_of_not_equal, people.size());
        }
    }
}
