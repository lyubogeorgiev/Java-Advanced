package t01StacksQueues;

import java.util.Scanner;

public class e06RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        long[] memory = new long[n + 1];

        System.out.println(findFibonacci(n, memory));
    }

    public static long findFibonacci(int n, long[] memory){
        if (n <= 1){
            return 1;
        }

        if (memory[n] != 0){
            return memory[n];
        }

        memory[n] = findFibonacci(n - 1, memory) + findFibonacci(n - 2, memory);
        return memory[n];
    }
}
