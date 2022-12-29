package t01StacksQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class e07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String text = "";
        Deque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] commands = scanner.nextLine().split("\\s+");
            String baseCommand = commands[0];

            if (baseCommand.equals("1")){
                stack.push(text);
                text += commands[1];
            }else if (baseCommand.equals("2")){
                stack.push(text);
                int count = Integer.parseInt(commands[1]);

                text = text.substring(0, text.length() - count);
            }else if (baseCommand.equals("3")){
                int positionIndex = Integer.parseInt(commands[1]);

                System.out.println(text.charAt(positionIndex - 1));
            }else{
                text = stack.pop();
            }

            //for debugging purposes
//            System.out.println("Test text is: " + text);
        }
    }
}
