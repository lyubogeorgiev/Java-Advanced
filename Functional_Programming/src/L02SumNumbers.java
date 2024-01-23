import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class L02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, String> countNumbers = n ->
                String.format("Count = %d", numbers.stream().count());
        Function<List<Integer>, String> calculateSum = n ->
                String.format("Sum = %d", numbers.stream().mapToInt(i -> Integer.valueOf(i)).sum());

        System.out.println(countNumbers.apply(numbers));
        System.out.println(calculateSum.apply(numbers));


    }
}
