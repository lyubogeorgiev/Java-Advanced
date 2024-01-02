import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Lab06ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Double>> shops = new TreeMap<>();

        while (!input.equals("Revision")){
            String[] inputTokens = input.split(", ");

            String store = inputTokens[0];
            String fruit = inputTokens[1];
            double price = Double.parseDouble(inputTokens[2]);

            shops.putIfAbsent(store, new LinkedHashMap<>());

            shops.get(store).put(fruit, price);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Double>> shop : shops.entrySet()) {
            System.out.printf("%s->%n", shop.getKey());

            for (Map.Entry<String, Double> fruit : shops.get(shop.getKey()).entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", fruit.getKey(), fruit.getValue());
            }
        }
    }
}
