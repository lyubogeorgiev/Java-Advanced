package t01StacksQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class e04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> queue = new ArrayDeque<>();
        Deque<Integer> minQueue = new ArrayDeque<>();

        int[] commands = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int numberToOffer = commands[0];
        int numberToPoll = commands[1];
        int numberToSearch = commands[2];

        for (int i = 0; i < numberToOffer; i++) {
            int currentNumber = scanner.nextInt();

            queue.offer(currentNumber);

            if (minQueue.isEmpty()){
                minQueue.offer(currentNumber);
            }else{
                //implement the logic of min number here
                while(!minQueue.isEmpty() && currentNumber < minQueue.peekLast()){
                    minQueue.pollLast();
                }

                minQueue.offer(currentNumber);
            }
        }

        for (int i = 0; i < numberToPoll; i++) {
            if (!queue.isEmpty()){

                int removedNumber = queue.poll();

                if (!minQueue.isEmpty() && removedNumber == minQueue.peek()){
                    minQueue.poll();
                }
            }
        }

        if (queue.contains(numberToSearch)){
            System.out.println("true");
        }else if (queue.isEmpty()){
            System.out.println(0);
        }else{
            System.out.println(minQueue.peek());
        }
    }
}
