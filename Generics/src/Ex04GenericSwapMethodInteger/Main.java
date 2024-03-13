package Ex04GenericSwapMethodInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Box<Integer>> boxList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            boxList.add(new Box<>(Integer.parseInt(scanner.nextLine())));
        }

        int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int first = indexes[0];
        int second = indexes[1];

        swapBoxes(boxList, first, second);

        for (Box<Integer> integerBox : boxList) {
            System.out.println(integerBox);
        }
    }

    public static void swapBoxes(List<Box<Integer>> list, int first, int second){
        Box<Integer> temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
}
