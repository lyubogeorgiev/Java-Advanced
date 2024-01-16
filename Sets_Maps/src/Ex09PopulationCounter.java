import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class Ex09PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> countries = new LinkedHashMap<>();

        while (!input.equals("report")){
            String[] inputTokens = input.split("\\|");

            String city = inputTokens[0];
            String country = inputTokens[1];
            int population = Integer.parseInt(inputTokens[2]);

            countries.putIfAbsent(country, new HashMap<>());

            countries.get(country).put(city, population);
            input = scanner.nextLine();
        }

//        System.out.println(countries);

        Map<String, Integer> countriesTotalPopulationMap = new LinkedHashMap<>();

        for (Map.Entry<String, Map<String, Integer>> country : countries.entrySet()) {
            int totalPopulation = 0;

            for (Integer value : country.getValue().values()) {
                totalPopulation += value;
            }

            countriesTotalPopulationMap.putIfAbsent(country.getKey(), totalPopulation);
        }

        //order countries by a total population they have
        List<Map.Entry<String, Integer>> orderedCountries = new ArrayList<>(countriesTotalPopulationMap.entrySet());

        orderedCountries.sort((entry1, entry2) ->
        {
            int valueComparison = entry2.getValue().compareTo(entry1.getValue());
            return (valueComparison != 0) ? valueComparison : entry1.getKey().compareTo(entry2.getKey());
        });

//        System.out.println(orderedCountries);

        for (Map.Entry<String, Integer> country : orderedCountries) {
            System.out.printf("%s (total population: %d)%n", country.getKey(), country.getValue());

            String countryName = country.getKey();

            List<Map.Entry<String, Integer>> orderedCities = new ArrayList<>(countries.get(countryName).entrySet());

//            System.out.println(orderedCities);

            orderedCities.sort((entry1, entry2) -> {
                int valueComparison = entry2.getValue().compareTo(entry1.getValue());
                return (valueComparison != 0) ? valueComparison : entry1.getKey().compareTo(entry2.getKey());
            });

            for (Map.Entry<String, Integer> city : orderedCities) {
                System.out.printf("=>%s: %d%n", city.getKey(), city.getValue());
            }
        }
    }
}
