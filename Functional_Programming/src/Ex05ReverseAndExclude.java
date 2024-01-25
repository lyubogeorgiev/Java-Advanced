import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> filterNumbers = num -> num % n != 0;
        Function<List<Integer>, List<Integer>> reverse = list -> {
            List<Integer> reversedList = new ArrayList<>();

            for (int i = list.size() - 1; i >= 0; i--) {
                reversedList.add(list.get(i));
            }

            return reversedList;
        };
        System.out.println(reverse.apply(numbers)
                .stream()
                .filter(filterNumbers)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));

    }
}
