import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex08CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();

        Comparator<Integer> sort = (f, s) -> {
            if (f % 2 == 0 && s % 2 != 0){
                return -1;
            } else if (f % 2 != 0 && s% 2 == 0){
                return 1;
            } else {
                return f - s;
            }
        };
        System.out.println(numbers.stream().sorted(sort).map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
