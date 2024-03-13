package Ex05GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Box<String>> strings = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            strings.add(new Box<>(scanner.nextLine()));
        }

        String valueToCompare = scanner.nextLine();

        System.out.println(countElements(strings, valueToCompare));
    }

    public static int countElements(List<Box<String>> list, String element){
        return (int) list.stream().filter(e -> e.compareTo(element) > 0).count();
    }
}
