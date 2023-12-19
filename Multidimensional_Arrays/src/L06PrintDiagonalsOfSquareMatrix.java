import java.util.Arrays;
import java.util.Scanner;

public class L06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        // printing the main diagonal
        for (int i = 0; i < matrix.length; i++) {

            System.out.print(matrix[i][i]);

            if (i != matrix.length - 1){
                System.out.print(" ");
            }
        }

        System.out.println();

        for (int i = matrix.length - 1, j = 0; i >= 0 && j < matrix.length ; i--, j++) {
            System.out.print(matrix[i][j]);

            if (i != 0){
                System.out.print(" ");
            }
        }

        System.out.println();
    }
}
