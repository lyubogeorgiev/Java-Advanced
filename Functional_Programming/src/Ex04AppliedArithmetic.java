import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex04AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<Integer, Integer> add = n -> n + 1;
        Function<Integer, Integer> multiply = n -> n * 2;
        Function<Integer, Integer> subtract = n -> n - 1;
        Consumer<List<Integer>> print = n -> {
            System.out.println(n.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        };

        String input = scanner.nextLine();

        while (!input.equals("end")){
            switch (input){
                case "add":
                    numbers = numbers.stream().map(add).collect(Collectors.toList());
                    break;
                case "subtract":
                    numbers = numbers.stream().map(subtract).collect(Collectors.toList());
                    break;
                case "multiply":
                    numbers = numbers.stream().map(multiply).collect(Collectors.toList());
                    break;
                case "print":
                    print.accept(numbers);
            }

            input = scanner.nextLine();
        }
    }
}
