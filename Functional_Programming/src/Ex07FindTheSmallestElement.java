import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> getSmallestIndex = list -> {
            int index = -1;

            int smallestNum = Integer.MAX_VALUE;

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) <= smallestNum){
                    smallestNum = list.get(i);
                    index = i;
                }
            }

            return index;
        };

        System.out.println(getSmallestIndex.apply(numbers));
    }
}
