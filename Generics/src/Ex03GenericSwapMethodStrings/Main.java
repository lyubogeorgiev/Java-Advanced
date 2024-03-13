package Ex03GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Box<String>> boxes = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            boxes.add(new Box<>(scanner.nextLine()));
        }

        int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int first = indexes[0];
        int second = indexes[1];

        Box<String> temp = boxes.get(first);
        boxes.set(first, boxes.get(second));
        boxes.set(second, temp);

        for (Box<String> box : boxes) {
            System.out.println(box);
        }
    }
}
