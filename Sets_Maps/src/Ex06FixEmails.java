import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> emailBook = new LinkedHashMap<>();

        while (!input.equals("stop")){
            String name = input;
            String email = scanner.nextLine();

            if (!email.endsWith("us")
                    && !email.endsWith("uk")
                    && !email.endsWith("com")){

                emailBook.put(name, email);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> person : emailBook.entrySet()) {
            System.out.printf("%s -> %s%n", person.getKey(), person.getValue());
        }
    }
}
