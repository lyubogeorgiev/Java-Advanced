import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class L04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Deque<Integer> symbolIndexes = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '('){
                symbolIndexes.push(i);
            } else if (currentChar == ')'){
                int startIndex = symbolIndexes.pop();

                for (int j = startIndex; j < i + 1; j++) {
                    System.out.print(input.charAt(j));
                }

                System.out.println();
            }
        }
    }
}
