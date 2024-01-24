import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class L04AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] prices = Arrays.stream(scanner.nextLine().split(", ")).mapToDouble(Double::parseDouble).toArray();

        UnaryOperator<Double> addVat = price -> price * 1.2;

        System.out.println("Prices with VAT:");

        Arrays.stream(prices).boxed().map(addVat::apply).forEach(p -> System.out.printf("%.2f%n", p));
    }
}
