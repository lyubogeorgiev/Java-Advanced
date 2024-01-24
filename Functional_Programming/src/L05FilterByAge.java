import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class L05FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputTokens = scanner.nextLine().split(", ");

            String name = inputTokens[0];
            int age = Integer.parseInt(inputTokens[1]);

            people.put(name, age);
        }

        String condition = scanner.nextLine();
        int ageRequirement = Integer.parseInt(scanner.nextLine());
        String[] format = scanner.nextLine().split("\\s+");

        Predicate<Map.Entry<String, Integer>> filterEntries;

        if (condition.equals("older")){
            filterEntries = e -> e.getValue() >= ageRequirement;
        } else {
            filterEntries = e -> e.getValue() <= ageRequirement;
        }

//        people.entrySet().stream().filter(filterEntries).forEach(System.out::println);

        Function <Map.Entry<String, Integer>, String> filterRules = entry -> {
          if (format.length > 1){
            return String.format("%s - %d", entry.getKey(), entry.getValue());
          }else{
              if (format[0].equals("name")){
                  return entry.getKey();
              } else {
                  return String.valueOf(entry.getValue());
              }
          }
        };

        List<String> result = people.entrySet().stream().filter(filterEntries).map(filterRules).toList();

        result.forEach(System.out::println);

    }
}
