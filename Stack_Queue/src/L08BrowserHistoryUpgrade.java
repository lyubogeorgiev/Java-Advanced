import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class L08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Deque<String> backStack = new ArrayDeque<>();
        Deque<String> forwardStack = new ArrayDeque<>();


        while (!input.equals("Home")){
            if (input.equals("back")){
                if (backStack.isEmpty()){
                    System.out.println("no previous URLs");
                } else {
                    String currentUrl = backStack.poll();
                    forwardStack.push(currentUrl);
                    System.out.println(backStack.peek());
                }
            } else if (input.equals("forward")){
                if (forwardStack.isEmpty()){
                    System.out.println("no next URLs");
                } else {
                    backStack.push(forwardStack.poll());
                    System.out.println(backStack.peek());
                }
            } else {
                forwardStack.clear();
                backStack.push(input);
            }

            input = scanner.nextLine();
        }
    }
}
