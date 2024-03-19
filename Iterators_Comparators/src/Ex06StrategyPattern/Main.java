package Ex06StrategyPattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Person> personName = new TreeSet<>(new NameComparator());
        Set<Person> personAge = new TreeSet<>(new AgeComparator());

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);

            personName.add(person);
            personAge.add(person);
        }

        for (Person person : personName) {
            System.out.println(person);
        }

        for (Person person : personAge) {
            System.out.println(person);
        }
    }
}
