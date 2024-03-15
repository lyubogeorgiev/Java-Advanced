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
                    stackIterator.push(convertToIntArray(tokens[1]));
                    break;
                case "Pop":
                    stackIterator.pop();
                    break;
            }

            command = scanner.nextLine();
        }

        for (Integer i : stackIterator) {
            System.out.println(i);
        }
    }

    private static Integer[] convertToIntArray(String input){
        return Arrays.stream(input.split(", ")).map(Integer::parseInt).toArray(Integer[]::new);
    }
}
