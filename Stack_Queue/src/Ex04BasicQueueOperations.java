import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Ex04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputTokens = scanner.nextLine().split("\\s+");

        int s = Integer.parseInt(inputTokens[1]);
        int x = Integer.parseInt(inputTokens[2]);

        Deque<Integer> queue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(queue::offer);

        for (int i = 0; i < s; i++) {
            queue.poll();
        }

        if (queue.contains(x)){
            System.out.println(true);
        } else {
            System.out.println(queue.stream().min(Integer::compareTo).orElse(0));
        }
    }
}
