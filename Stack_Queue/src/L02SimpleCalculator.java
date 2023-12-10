import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class L02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        Deque<String> signs = new ArrayDeque<>();
        Deque<Integer> numbers = new ArrayDeque<>();

        for (int i = tokens.length - 1; i >= 0; i--) {
            if (tokens[i].equals("-") || tokens[i].equals("+")){
                signs.push(tokens[i]);
            } else {
                int number = Integer.parseInt(tokens[i]);
                numbers.push(number);
            }
        }

        while(!numbers.isEmpty() && !signs.isEmpty()){
            int firstNum = numbers.pop();
            int secondNum = numbers.pop();

            String sign = signs.pop();

            if (sign.equals("+")){
                numbers.push(firstNum + secondNum);
            } else {
                numbers.push(firstNum - secondNum);
            }
        }

        if (!numbers.isEmpty()){

            System.out.println(numbers.peek());
        }
    }
}
