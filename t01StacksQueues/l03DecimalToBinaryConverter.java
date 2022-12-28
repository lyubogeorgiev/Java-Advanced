package t01StacksQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class l03DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num == 0){
            System.out.println(0);
            return;
        }

        Deque<Integer> binaryStack = new ArrayDeque<>();

        while(num > 0){
            int remainder = num % 2;
            num /= 2;

            binaryStack.push(remainder);
        }

        StringBuilder binaryNumber = new StringBuilder();

        while (!binaryStack.isEmpty()){
            binaryNumber.append(binaryStack.pop());
        }

        System.out.println(binaryNumber);
    }
}
