import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class L06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bounds = scanner.nextLine().split("\\s+");

        int lowerBound = Integer.parseInt(bounds[0]);
        int upperBound = Integer.parseInt(bounds[1]);

        String command = scanner.nextLine();

        List<Integer> numbers = new ArrayList<>();

        for (int i = lowerBound; i <= upperBound ; i++) {
            numbers.add(i);
        }

        Predicate<Integer> filterByCommand = n -> {
            if (command.equals("even")){
                return n % 2 == 0;
            } else {
                return n % 2 != 0;
            }
        };

        List<Integer> collect = numbers.stream().filter(filterByCommand).toList();

        System.out.println(collect.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}
