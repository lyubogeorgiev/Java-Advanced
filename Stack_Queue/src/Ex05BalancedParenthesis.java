import java.util.*;

public class Ex05BalancedParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputTokens = scanner.nextLine();
        List<Character> openParenthesisTable = Arrays.asList('[', '(', '{');
        List<Character> closeParenthesisTable = Arrays.asList(']', ')', '}');

        Deque<Character> parenthesisStack = new ArrayDeque<>();
        boolean areEqual = true;

        for (int i = 0; i < inputTokens.length(); i++) {
            char currentParenthesis = inputTokens.charAt(i);
            if (openParenthesisTable.contains(currentParenthesis)){
                parenthesisStack.push(currentParenthesis);
            } else {
                if (parenthesisStack.isEmpty()){
                    areEqual = false;
                    break;
                }

                char currentOpenParenthesis = parenthesisStack.pop();
                char currentCloseParenthesis = inputTokens.charAt(i);

                if (openParenthesisTable
                        .indexOf(currentOpenParenthesis) != closeParenthesisTable.indexOf(currentCloseParenthesis)){
                    areEqual = false;
                    break;
                }
            }
        }

        System.out.println(areEqual ? "YES" : "NO");
    }
}
