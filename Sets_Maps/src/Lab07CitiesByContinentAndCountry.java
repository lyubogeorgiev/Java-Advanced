import java.util.*;

public class Lab07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, List<String>>> continents = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] inputTokens = scanner.nextLine().split("\\s+");

            String continentName = inputTokens[0];
            String countryName = inputTokens[1];
            String cityName = inputTokens[2];

            continents.putIfAbsent(continentName, new LinkedHashMap<>());
            continents.get(continentName).putIfAbsent(countryName, new ArrayList<>());

            continents.get(continentName).get(countryName).add(cityName);
        }

        for (Map.Entry<String, Map<String, List<String>>> continent : continents.entrySet()) {
            System.out.printf("%s:%n", continent.getKey());

            for (Map.Entry<String, List<String>> country : continent.getValue().entrySet()) {

                System.out.printf("    %s -> ", country.getKey());
                System.out.print(String.join(", ", country.getValue()));
                System.out.println();

            }
        }
    }
}
