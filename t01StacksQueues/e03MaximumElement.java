package t01StacksQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class e03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> maxStack = new ArrayDeque<>();

        int numberCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberCommands; i++) {
            int[] commandTokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (commandTokens[0] == 1){
                //push element to the stack
                int elementToPush = commandTokens[1];
                stack.push(elementToPush);

                if (maxStack.isEmpty()){
                    maxStack.push(elementToPush);
                }else{
                    int maxElement = elementToPush > maxStack.peek()
                            ? elementToPush
                            : maxStack.peek();

                    maxStack.push(maxElement);
                }
            }else if (commandTokens[0] == 2){
                //pop an element from the stack
                stack.pop();
                maxStack.pop();
            }else{
                //print the max element in the stack
                System.out.println(maxStack.peek());
            }
        }

    }
}
