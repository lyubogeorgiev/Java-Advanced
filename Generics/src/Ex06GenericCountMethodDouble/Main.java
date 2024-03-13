package Ex06GenericCountMethodDouble;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Box<Double>> doubles = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            doubles.add(new Box<>(Double.parseDouble(scanner.nextLine())));
        }

        Double element = Double.parseDouble(scanner.nextLine());

        System.out.println(doubles.stream().filter(e -> e.compareTo(element) > 0).count());
    }
}
