import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class L05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Deque<String> printJobs = new ArrayDeque<>();

        while (!input.equals("print")){

            if (input.equals("cancel")){
                if (!printJobs.isEmpty()){
                    String currentJob = printJobs.poll();

                    System.out.printf("Canceled %s%n", currentJob);
                } else {
                    System.out.println("Printer is on standby");
                }
            } else {
                printJobs.offer(input);
            }

            input = scanner.nextLine();
        }

        while (!printJobs.isEmpty()){
            System.out.println(printJobs.poll());
        }
    }
}
