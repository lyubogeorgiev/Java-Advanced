import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Ex06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).toList();

        Predicate<String> checkLength = s -> s.length() <= length;

        names.stream().filter(checkLength).forEach(System.out::println);
    }
}
