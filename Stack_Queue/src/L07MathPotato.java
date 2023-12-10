import java.util.*;

public class L07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<String> kidsQueue = new PriorityQueue<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(kidsQueue::offer);

        int n = Integer.parseInt(scanner.nextLine());
        int count = 1;

        while (kidsQueue.size() > 1){

            for (int i = 0; i < n - 1; i++) {
                kidsQueue.offer(kidsQueue.poll());
            }

            if (isPrime(count)){
                System.out.println("Prime " + kidsQueue.peek());
            } else {
                System.out.println("Removed " + kidsQueue.poll());
            }

            count++;

        }

        System.out.println("Last is " + kidsQueue.peek());
    }

    public static boolean isPrime(int n){

        if (n == 1){
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }
}
