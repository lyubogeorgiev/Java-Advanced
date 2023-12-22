import java.util.Arrays;
import java.util.Scanner;

public class Ex07Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = dimensions[0];
        int m = dimensions[1];

        int[][] matrix = new int[n][m];

        int fillNumber = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ++fillNumber;
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("Nuke it from orbit")) {
            int[] commands = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int row = commands[0];
            int col = commands[1];
            int radius = commands[2];

            destroy(matrix, row, col, radius);

            input = scanner.nextLine();
        }

        printMatrixSpecial(matrix);
    }

    private static void printMatrixSpecial(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt != -1) {
                    System.out.print(anInt);

                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    private static void destroy(int[][] matrix, int row, int col, int radius) {
        int leftLimit = col - radius;
        int rightLimit = col + radius;
        int upperLimit = row - radius;
        int downLimit = row + radius;

        for (int i = col; i <= rightLimit && i < matrix[0].length; i++) {
            if (row < matrix[0].length && row >= 0 && i >= 0){
                matrix[row][i] = -1;
            }
        }

        for (int i = col; i >= leftLimit && i >= 0; i--) {
            if (row < matrix[0].length && row >= 0  && i < matrix[0].length){
                matrix[row][i] = -1;
            }
        }

        for (int i = row + 1; i <= downLimit && i < matrix.length; i++) {
            if (col < matrix[0].length && col >= 0 && i >= 0){
                matrix[i][col] = -1;
            }
        }

        for (int i = row - 1; i >= upperLimit && i >= 0; i--) {
            if (col < matrix[0].length && col >= 0 && i < matrix.length){
                matrix[i][col] = -1;
            }
        }

        moveElement(matrix);
        removeEmptyRows(matrix);
    }

    private static void removeEmptyRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == -1){
                //move this row all the way to the end
                int row = i;

                int[] temp = matrix[i];

                while (row < matrix.length - 1){
                    matrix[row] = matrix[row + 1];
                    row++;
                }

                matrix[matrix.length - 1] = temp;
            }
        }
    }

    private static void moveElement(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1) {
                    int index = j;
                    while (index++ < matrix[i].length - 1) {
                        matrix[i][index - 1] = matrix[i][index];
                    }

                    matrix[i][matrix[i].length - 1] = -1;
                }
            }
        }
    }
}
