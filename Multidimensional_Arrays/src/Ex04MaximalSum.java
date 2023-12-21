import java.util.Arrays;
import java.util.Scanner;

public class Ex04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = dimensions[0];
        int m = dimensions[1];

        int[][] matrix = new int[n][m];
        int rowMaxSumSubMatrix = 0;
        int colMaxSumSubMatrix = 0;

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                int tempSum = 0;

                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        tempSum += matrix[k][l];
                    }
                }

                if (tempSum > maxSum){
                    maxSum = tempSum;

                    rowMaxSumSubMatrix = i;
                    colMaxSumSubMatrix = j;
                }
            }
        }

        System.out.println("Sum = " + maxSum);

        for (int i = rowMaxSumSubMatrix; i < rowMaxSumSubMatrix + 3; i++) {
            for (int j = colMaxSumSubMatrix; j < colMaxSumSubMatrix + 3; j++) {
                System.out.print(matrix[i][j]);

                if (j != colMaxSumSubMatrix + 2){
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
