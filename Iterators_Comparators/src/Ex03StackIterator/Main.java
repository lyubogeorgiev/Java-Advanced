package Ex03StackIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StackIterator stackIterator = new StackIterator();

        String command = scanner.nextLine();

        while (!command.equals("END")){
            String[] tokens = command.split("\\s+");

            switch (tokens[0]){
                case "Push":
                    stackIterator.push(convertToIntArray(command));
                    break;
                case "Pop":
                    stackIterator.pop();
                    break;
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < 2; i++) {

            for (Integer num : stackIterator) {
                System.out.println(num);
            }
        }
    }

    private static Integer[] convertToIntArray(String input){
        String[] tokens = input.split(", ");
        tokens[0] = tokens[0].split("\\s+")[1];

        return Arrays.stream(tokens).map(Integer::parseInt).toArray(Integer[]::new);
    }
}
