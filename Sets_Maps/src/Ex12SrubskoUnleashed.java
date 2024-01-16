import java.util.*;

public class Ex12SrubskoUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> venues = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] inputTokens = input.split(" @");

            input = scanner.nextLine();

            if (inputTokens.length != 2){
                continue;
            }

            String singer = inputTokens[0];
            String[] venueTokens = inputTokens[1].split("\\s+");

            if (venueTokens.length < 3 || venueTokens.length > 5){
                continue;
            }

            String venueName = String.join(" ", Arrays.copyOfRange(venueTokens, 0, venueTokens.length - 2));
            int numberOfTicket = Integer.parseInt(venueTokens[venueTokens.length - 2]);
            int ticketPrice = Integer.parseInt(venueTokens[venueTokens.length - 1]);

            int totalPrice = numberOfTicket * ticketPrice;

            venues.putIfAbsent(venueName, new LinkedHashMap<>());

            venues.get(venueName).putIfAbsent(singer, 0);
            venues.get(venueName).put(singer, venues.get(venueName).get(singer) + totalPrice);
        }

        for (Map.Entry<String, Map<String, Integer>> venue : venues.entrySet()) {
            System.out.printf("%s%n", venue.getKey());

            List<Map.Entry<String, Integer>> orderedSingers = new ArrayList<>(venue.getValue().entrySet());

            orderedSingers.sort((entry1, entry2) -> {
                int valueComparison = entry2.getValue().compareTo(entry1.getValue());
                return valueComparison != 0 ? valueComparison : entry1.getKey().compareTo(entry2.getKey());
            });

            for (Map.Entry<String, Integer> singer : orderedSingers) {
                System.out.printf("#  %s -> %d%n", singer.getKey(), singer.getValue());
            }
        }
    }
}
