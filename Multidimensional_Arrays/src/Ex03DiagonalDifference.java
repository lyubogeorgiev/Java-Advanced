import java.util.Arrays;
import java.util.Scanner;

public class Ex03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int mainDiagonalSum = sumOfMainDiagonal(matrix);
        int secondDiagonalSum = sumOfSecondDiagonal(matrix);

        int diffBetweenSums = Math.abs(mainDiagonalSum - secondDiagonalSum);

        System.out.println(diffBetweenSums);
    }

    private static int sumOfSecondDiagonal(int[][] matrix) {
        int sum = 0;

        for (int i = matrix.length - 1, j = 0; i >= 0 && j < matrix.length; i--, j++) {
            sum += matrix[i][j];
        }

        return sum;
    }

    private static int sumOfMainDiagonal(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }
}
