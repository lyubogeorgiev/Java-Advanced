import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Ex01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> numbers = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(numbers::push);

        while (!numbers.isEmpty()){
            int currentNumber = numbers.poll();

            if (numbers.isEmpty()){
                System.out.println(currentNumber);
            } else {
                System.out.print(currentNumber + " ");
            }
        }
    }
}
