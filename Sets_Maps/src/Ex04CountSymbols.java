import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> symbols = new TreeMap<>();

        String line = scanner.nextLine();

        for (int i = 0; i < line.length(); i++) {
            symbols.putIfAbsent(line.charAt(i), 0);

            symbols.put(line.charAt(i), symbols.get(line.charAt(i)) + 1);
        }

        for (Map.Entry<Character, Integer> symbol : symbols.entrySet()) {
            System.out.printf("%c: %d time/s%n", symbol.getKey(), symbol.getValue());
        }
    }
}
