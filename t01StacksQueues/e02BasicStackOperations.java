package t01StacksQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class e02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] commands = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> minStack = new ArrayDeque<>();

        int numbersToPush = commands[0];
        int numbersToPop = commands[1];
        int numberToSearch = commands[2];

        for (int i = 0; i < numbersToPush; i++) {
            int currentNumber = scanner.nextInt();

            stack.push(currentNumber);

            if (minStack.isEmpty()){
                minStack.push(currentNumber);
            }else{
                int minNumber = currentNumber < minStack.peek() ? currentNumber : minStack.peek();
                minStack.push(minNumber);
            }
        }

        for (int i = 0; i < numbersToPop; i++) {
            stack.pop();
            minStack.pop();
        }

        if (stack.contains(numberToSearch)){
            System.out.println("true");
        }else if (stack.isEmpty()){
            System.out.println(0);
        }else{
            System.out.println(minStack.peek());
        }
    }
}
