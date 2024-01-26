import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex10PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("Party!")){
            String[] inputTokens = input.split("\\s+");

            String condition = inputTokens[0];
            Predicate<String> filterByName = getStringPredicate(inputTokens);

            List<String> filteredList = guests.stream().filter(filterByName).collect(Collectors.toList());

            if (condition.equals("Remove")){
                guests = filteredList;
            } else if (condition.equals("Double")){
                guests.addAll(filteredList);
            }

            input = scanner.nextLine();
        }

        String finalGuestString = guests.stream().sorted().collect(Collectors.joining(", "));
        if (finalGuestString.isEmpty()){
            System.out.println("Nobody is going to the party!");
        } else {
            System.out.printf("%s are going to the party!%n", finalGuestString);
        }
    }

    private static Predicate<String> getStringPredicate(String[] inputTokens) {
        String condition = inputTokens[0];
        String command = inputTokens[1];
        String charSequence = inputTokens[2];

        Predicate<String> filterByName;

        if (command.equals("StartsWith")){
            filterByName = name -> {
                if (condition.equals("Double")){
                    return name.startsWith(charSequence);
                } else {
                    return !name.startsWith(charSequence);
                }
            };
        } else if (command.equals("EndsWith")) {
            filterByName = name -> {
                if (condition.equals("Double")){
                    return name.endsWith(charSequence);
                }else{
                    return !name.endsWith(charSequence);
                }
            };
        } else {
            filterByName = name -> {
                int length = Integer.parseInt(charSequence);

                if (condition.equals("Double")){
                    return name.length() == length;
                }else{
                    return name.length() != length;
                }
            };
        }
        return filterByName;
    }
}
