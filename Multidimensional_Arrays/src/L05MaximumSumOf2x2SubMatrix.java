import java.util.Arrays;
import java.util.Scanner;

public class L05MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sizeTokens = scanner.nextLine().split(", ");

        int m = Integer.parseInt(sizeTokens[0]);
        int n = Integer.parseInt(sizeTokens[1]);

        int[][] matrix = new int[m][];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        //the matrix was filled, now we need to iterate through each 2x2 matrix inside of the main matrix.
        int maxSum = 0;
        int[][] maxSumSubMatrix = new int[m][n];

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                int currentSum = matrix[i][j]
                        + matrix[i][j + 1]
                        + matrix[i + 1][j]
                        + matrix[i + 1][j + 1];

                if (currentSum > maxSum){
                    maxSum = currentSum;

                    maxSumSubMatrix[0][0] = matrix[i][j];
                    maxSumSubMatrix[0][1] = matrix[i][j + 1];
                    maxSumSubMatrix[1][0] = matrix[i + 1][j];
                    maxSumSubMatrix[1][1] = matrix[i + 1][j + 1];
                }
            }
        }

        System.out.println(maxSumSubMatrix[0][0] + " " + maxSumSubMatrix[0][1]);
        System.out.println(maxSumSubMatrix[1][0] + " " + maxSumSubMatrix[1][1]);

        System.out.println(maxSum);
    }
}
