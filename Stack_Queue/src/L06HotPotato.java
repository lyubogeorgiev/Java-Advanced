import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class L06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputTokens = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        Deque<String> kidsQueue = new ArrayDeque<>();

        Arrays.stream(inputTokens).forEach(kidsQueue::offer);

        while (kidsQueue.size() > 1){

            for (int i = 0; i < n - 1; i++) {
                kidsQueue.offer(kidsQueue.poll());
            }

            System.out.println("Removed " + kidsQueue.poll());
        }

        System.out.printf("Last is %s%n", kidsQueue.peek());
    }
}
