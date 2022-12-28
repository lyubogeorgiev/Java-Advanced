package t01StacksQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class l05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> printerQueue = new ArrayDeque<>();

        String input = scanner.nextLine();

        while(!input.equals("print")){
            if (input.equals("cancel")){
                if (printerQueue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else{
                    String jobToCancel = printerQueue.poll();
                    System.out.printf("Canceled %s%n", jobToCancel);
                }
            }else{
                printerQueue.offer(input);
            }

            input = scanner.nextLine();
        }

        for (String job : printerQueue) {
            System.out.println(job);
        }
    }
}
