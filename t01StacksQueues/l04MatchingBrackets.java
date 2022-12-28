package t01StacksQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class l04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> openingBracketsIndexes = new ArrayDeque<>();

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '('){
                openingBracketsIndexes.push(i);
            }else if (currentChar == ')'){
                //here will be the logic to print everything between ( and )
                int startIndex = openingBracketsIndexes.pop();
                int endIndex = i;

                System.out.println(input.substring(startIndex, endIndex + 1));
            }
        }


    }
}
