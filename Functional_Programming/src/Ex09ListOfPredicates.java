import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int range = Integer.parseInt(scanner.nextLine());

        List<Integer> divisors = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= range ; i++) {
            numbers.add(i);
        }

        Predicate<Integer> isDivisible = num -> {
            boolean isCurrentDivisible = true;

            for (Integer divisor : divisors) {
                if (num % divisor != 0){
                    return false;
                }
            }

            return isCurrentDivisible;
        };

        System.out.println(numbers.stream()
                .filter(isDivisible)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
