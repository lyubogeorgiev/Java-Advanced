package t01StacksQueues;

import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class e05BalancedParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Character> stack = new ArrayDeque<>();
        boolean isMatching = true;

        String input = scanner.nextLine();
        Character[] openBrackets = {'(', '[', '{'};
        Character[] closeBrackets = {')', ']', '}'};

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Arrays.stream(openBrackets).anyMatch(a -> a == currentChar)){
                stack.push(currentChar);
            }else{
                if (stack.isEmpty()){
                    isMatching = false;
                    break;
                }
                char charToMatch = stack.pop();

                if (findIndex(closeBrackets, currentChar) != findIndex(openBrackets, charToMatch)){
                    isMatching = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()){
            isMatching = false;
        }

        System.out.println(isMatching ? "YES" : "NO");
    }

    public static int findIndex(Character[] array, char element){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element){
                return i;
            }
        }

        return -1;
    }
}
