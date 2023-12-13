import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Deque<String> stack = new ArrayDeque<>();
        stack.push("");

        while (n-- > 0){
            String[] inputTokens = scanner.nextLine().split("\\s+");

            int command = Integer.parseInt(inputTokens[0]);

            switch (command) {
                case 1:
                    stack.push(stack.peek() + inputTokens[1]);
                    break;
                case 2:
                    int count = Integer.parseInt(inputTokens[1]);
                    String lastString = stack.peek();
                    if (lastString != null) {
                        stack.push(lastString.substring(0, lastString.length() - count));
                    }
                    break;
                case 3:
                    int index = Integer.parseInt(inputTokens[1]) - 1;
                    if (stack.peek() != null) {
                        System.out.println(stack.peek().charAt(index));
                    }
                    break;
                case 4:
                    if (!stack.isEmpty()){
                        stack.pop();
                    }
                    break;
            }
        }
    }
}
