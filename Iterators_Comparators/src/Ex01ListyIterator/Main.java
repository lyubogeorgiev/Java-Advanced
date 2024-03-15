package Ex01ListyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListyIterator listyIterator = new ListyIterator();

        String command = scanner.nextLine();

        while (!command.equals("END")){

            String[] tokens = command.split("\\s+");

            switch (tokens[0]){
                case "Create":
                    listyIterator = new ListyIterator(Arrays.copyOfRange(tokens, 1, tokens.length));
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    listyIterator.print();
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
