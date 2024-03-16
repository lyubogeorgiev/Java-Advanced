package Ex04Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).toArray(Integer[]::new);

        Lake lake = new Lake(numbers);

        List<Integer> lakeOutput = new ArrayList<>();

        for (Integer i : lake) {
            lakeOutput.add(i);
        }

        String output = lakeOutput.stream().map(String::valueOf).collect(Collectors.joining(", "));

        System.out.println(output);
    }
}
