package t01StacksQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class e01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArrays = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Deque<Integer> stack = new ArrayDeque<>();

        for (Integer number : numbersArrays) {
            stack.push(number);
        }

        //now print all the numbers from the stack
        while(!stack.isEmpty()){
            System.out.printf("%d ", stack.pop());
        }
    }
}
