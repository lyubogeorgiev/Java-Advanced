import java.util.Arrays;
import java.util.Scanner;

public class L04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sizeTokens = scanner.nextLine().split(", ");

        int m = Integer.parseInt(sizeTokens[0]);
        int n = Integer.parseInt(sizeTokens[1]);

        int[][] matrix = new int[m][];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        int sum = 0;

        for (int[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                sum += row[j];
            }
        }

        System.out.println(m);
        System.out.println(n);
        System.out.println(sum);
    }
}
