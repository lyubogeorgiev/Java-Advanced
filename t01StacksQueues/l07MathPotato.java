package t01StacksQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class l07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kidsString = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        Deque<String> kidsQueue = new ArrayDeque<>();

        Collections.addAll(kidsQueue, kidsString);

        int cycleNumber = 1;

        while(kidsQueue.size() > 1){

            for (int i = 1; i < n; i++) {
                String currentKid = kidsQueue.poll();
                kidsQueue.offer(currentKid);

            }

            if (isPrime(cycleNumber)){
                System.out.printf("Prime %s%n", kidsQueue.peek());
            }else{
                String removedKid = kidsQueue.poll();
                System.out.printf("Removed %s%n", removedKid);
            }


            cycleNumber++;
        }

        System.out.printf("Last is %s%n", kidsQueue.peek());
    }

    public static boolean isPrime(int number){
        //function to check if a number is a prime number

        if (number == 1){
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }
}
