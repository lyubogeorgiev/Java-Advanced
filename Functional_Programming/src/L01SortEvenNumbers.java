import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class L01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        IntPredicate filterEven = n -> n % 2 == 0;
        int[] evenNumbers = Arrays.stream(numbers).filter(filterEven).toArray();

        System.out.println(Arrays.stream(evenNumbers).mapToObj(String::valueOf).collect(Collectors.joining(", ")));

        String result = Arrays.stream(evenNumbers).sorted().mapToObj(String::valueOf).collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
