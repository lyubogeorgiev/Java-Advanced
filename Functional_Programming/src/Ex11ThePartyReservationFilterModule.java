import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex11ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();

        Map<String, Predicate<String>> filterMap = new HashMap<>();

        while (!input.equals("Print")){

            String[] tokens = input.split("\\s+");

            String command = tokens[0];
            String filterType = tokens[1].split(";")[1];

            String[] filterSymbolTokens = tokens[2].split(";");

            String filterSymbol;

            if (filterSymbolTokens.length > 1){
                filterSymbol = filterSymbolTokens[1];
            } else {
                filterSymbol = filterSymbolTokens[0];
            }

            String key = filterType + filterSymbol;

            if (command.equals("Add")){
                switch (filterType) {
                    case "Starts" -> {
                        Predicate<String> filterStarts = name -> !name.startsWith(filterSymbol);

                        filterMap.put(key, filterStarts);
                    }
                    case "Ends" -> {
                        Predicate<String> filterEnds = name -> !name.endsWith(filterSymbol);

                        filterMap.put(key, filterEnds);
                    }
                    case "Length" -> {
                        Predicate<String> filterLength = name -> name.length() != Integer.parseInt(filterSymbol);

                        filterMap.put(key, filterLength);
                    }
                    case "Contains" -> {
                        Predicate<String> filterContains = name -> !name.contains(filterSymbol);

                        filterMap.put(key, filterContains);
                    }
                }
            } else if (command.equals("Remove")){
                filterMap.remove(key);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Predicate<String>> currentFilter : filterMap.entrySet()) {
            guests = guests.stream().filter(currentFilter.getValue()).collect(Collectors.toList());
        }

        System.out.println(String.join(" ", guests));
    }
}
