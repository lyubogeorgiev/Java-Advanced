import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class L01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> stack = new ArrayDeque<>();

        String input = scanner.nextLine();

        while(!input.equals("Home")){
            if (input.equals("back")){
                if (!stack.isEmpty()){
                    String currentUrl = stack.pop();

                    if (stack.isEmpty()){
                        stack.push(currentUrl);
                        System.out.println("no previous URLs");
                    } else {
                        System.out.println(stack.peek());
                    }
                } else {
                    System.out.println("no previous URLs");
                }

            } else {
                stack.push(input);
                System.out.println(stack.peek());
            }

            input = scanner.nextLine();
        }
    }
}