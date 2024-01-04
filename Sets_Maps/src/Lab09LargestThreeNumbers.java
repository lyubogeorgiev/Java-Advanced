import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab09LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sortedList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .toList();

        for (int i = 0; i < 3 && i < sortedList.size(); i++) {
            System.out.print(sortedList.get(i) + " ");
        }

        System.out.println();
    }
}
