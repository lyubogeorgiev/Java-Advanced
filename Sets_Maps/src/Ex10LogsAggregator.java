import java.util.*;
import java.util.stream.Collectors;

public class Ex10LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> usersIp = new TreeMap<>();
        Map<String, List<Integer>> usersDuration = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] inputTokens = scanner.nextLine().split("\\s+");

            String ip = inputTokens[0];
            String user = inputTokens[1];
            int duration = Integer.parseInt(inputTokens[2]);

            usersIp.putIfAbsent(user, new TreeSet<>());
            usersDuration.putIfAbsent(user, new ArrayList<>());

            usersIp.get(user).add(ip);
            usersDuration.get(user).add(duration);
        }

        for (String username : usersDuration.keySet()) {
            System.out.printf("%s: ", username);
            int duration = usersDuration.get(username).stream().mapToInt(Integer::intValue).sum();

            System.out.printf("%d ", duration);

            System.out.printf("[%s]%n", usersIp.get(username).stream().sorted().collect(Collectors.joining(", ")));
        }
    }
}
