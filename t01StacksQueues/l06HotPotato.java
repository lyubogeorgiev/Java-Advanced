package t01StacksQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class l06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kidsString = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        Deque<String> kidsQueue = new ArrayDeque<>();

        Collections.addAll(kidsQueue, kidsString);

        while(kidsQueue.size() > 1){

            for (int i = 1; i < n; i++) {
                String currentKid = kidsQueue.poll();
                kidsQueue.offer(currentKid);

            }

            String removedKid = kidsQueue.poll();
            System.out.printf("Removed %s%n", removedKid);
        }

        System.out.printf("Last is %s%n", kidsQueue.peek());
    }
}
