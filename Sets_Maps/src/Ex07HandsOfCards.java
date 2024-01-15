import java.util.*;

public class Ex07HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Set<String>> players = new LinkedHashMap<>();

        while (!input.equals("JOKER")){

            String[] inputTokens = input.split(": ");
            String playerName = inputTokens[0];

            String[] cards = inputTokens[1].split(", ");

            players.putIfAbsent(playerName, new HashSet<>());

            players.get(playerName).addAll(List.of(cards));

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> player : players.entrySet()) {
            int currentPlayerPoints = calculatePlayersPoints(player.getValue());

            System.out.printf("%s: %d%n", player.getKey(), currentPlayerPoints);
        }
    }

    public static int calculatePlayersPoints(Set<String> deck){

        int sum = 0;

        for (String card : deck) {
            String strength = card.substring(0, card.length() - 1);
            String power = card.substring(card.length() - 1);

            int value = 0;

            switch (strength){
                case "J":
                    value = 11;
                    break;
                case "Q":
                    value = 12;
                    break;
                case "K":
                    value = 13;
                    break;
                case "A":
                    value = 14;
                    break;
                default:
                    value = Integer.parseInt(strength);
                    break;
            }

            switch (power){
                case "S":
                    sum += value * 4;
                    break;
                case "H":
                    sum += value * 3;
                    break;
                case "D":
                    sum += value * 2;
                    break;
                case "C":
                    sum += value;
                    break;
            }
        }

        return sum;
    }
}
