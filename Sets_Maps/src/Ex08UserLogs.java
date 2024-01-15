import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex08UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> users = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] inputTokens = input.split("\\s+");

            String username = inputTokens[2].split("=")[1];
            String userIp = inputTokens[0].split("=")[1];

            users.putIfAbsent(username, new LinkedHashMap<>());

            users.get(username).putIfAbsent(userIp, 0);
            users.get(username).put(userIp, users.get(username).get(userIp) + 1);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Integer>> user : users.entrySet()) {
            System.out.printf("%s:%n", user.getKey());

            StringBuilder stringBuilder = new StringBuilder();

            for (Map.Entry<String, Integer> ipMap : user.getValue().entrySet()) {
                stringBuilder.append(String.format("%s => %d, ", ipMap.getKey(), ipMap.getValue()));
            }

            stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), ".");

            System.out.println(stringBuilder);
        }
    }
}
