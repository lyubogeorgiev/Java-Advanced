import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class L03DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());

        Deque<Integer> binary = new ArrayDeque<>();

        if (decimal == 0){
            binary.push(decimal);
        }

        while (decimal > 0){
            int currBinDigit = decimal % 2;
            binary.push(currBinDigit);
            decimal /= 2;
        }

        binary.stream().forEach(System.out::print);

        System.out.println();
    }
}
