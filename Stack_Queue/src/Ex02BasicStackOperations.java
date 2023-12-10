import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Ex02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] headData = scanner.nextLine().split("\\s+");

        Deque<Integer> stack = new ArrayDeque<>();

        int n = Integer.parseInt(headData[0]);
        int s = Integer.parseInt(headData[1]);
        int x = Integer.parseInt(headData[2]);

        int[] elements = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++){
            stack.push(elements[i]);
        }

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (stack.isEmpty()){
            System.out.println(0);
        } else {
            if (stack.contains(x)){
                System.out.println(true);
            } else {
                System.out.println(stack.stream().min(Integer::compareTo).orElse(0));
            }
        }

    }
}
