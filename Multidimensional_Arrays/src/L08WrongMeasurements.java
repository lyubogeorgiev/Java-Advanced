import java.util.Arrays;
import java.util.Scanner;

public class L08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int[] wrongValueIndex = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int wrongValue = matrix[wrongValueIndex[0]][wrongValueIndex[1]];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == wrongValue){
                    int sum = 0;

                    if ((i - 1 >= 0) && (matrix[i - 1][j] != wrongValue)){
                        sum += matrix[i - 1][j];
                    }

                    if ((j - 1 >= 0) && (matrix[i][j - 1] != wrongValue)){
                        sum += matrix[i][j - 1];
                    }

                    if ((i + 1 < matrix.length) && (matrix[i + 1][j] != wrongValue)){
                        sum += matrix[i + 1][j];
                    }

                    if ((j + 1 < matrix[i].length) && (matrix[i][j + 1] != wrongValue)){
                        sum += matrix[i][j + 1];
                    }

                    matrix[i][j] = sum;
                }
            }
        }

        for (int[] row : matrix) {
//            System.out.println(Arrays.toString(row));

            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]);

                if (i != row.length - 1){
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
