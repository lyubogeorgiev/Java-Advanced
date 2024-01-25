import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        Function<Set<Integer>, Integer> customMin = n -> {
            int min = Integer.MAX_VALUE;

            for (int currentNum : n) {
                if (min > currentNum) {
                    min = currentNum;
                }
            }

            return min;
        };

        System.out.println(customMin.apply(numbers));
    }
}