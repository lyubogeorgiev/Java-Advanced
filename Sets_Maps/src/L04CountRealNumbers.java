import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class L04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] inputTokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> numbersMap = new LinkedHashMap<>();

        for (double number : inputTokens) {
            numbersMap.putIfAbsent(number, 0);

            numbersMap.put(number, numbersMap.get(number) + 1);
        }

        for (Map.Entry<Double, Integer> currentEntry : numbersMap.entrySet()) {
            System.out.printf("%.1f -> %d%n", currentEntry.getKey(), currentEntry.getValue());
        }
    }
}
