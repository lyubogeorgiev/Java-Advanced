import java.util.Scanner;

public class Ex06RecursiveFibonacci {

    public static long[] fibonacciTable;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = Integer.parseInt(scanner.nextLine());

        fibonacciTable = new long[limit];

        System.out.println(fibonacci(limit));
    }

    public static long fibonacci(int n){
        if (n < 2){
            return 1;
        }

        if (fibonacciTable[n - 1] > 0){
            return fibonacciTable[n - 1];
        }

        return fibonacciTable[n - 1] = fibonacci(n - 1) + fibonacci(n - 2);
    }
}
