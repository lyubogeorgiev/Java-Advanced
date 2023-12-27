import java.util.Arrays;
import java.util.Scanner;

public class Ex11ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        for (int i = matrix.length - 1; i >= 0 ; i--) {
            if (i == matrix.length - 1){
                for (int j = matrix[i].length - 1; j >= 0 ; j--) {
                    int r = i;
                    int c = j;

                    while (r >= 0 && c < matrix[i].length){
                        System.out.print(matrix[r][c] + " ");
                        r--;
                        c++;
                    }
                    System.out.println();
                }
            } else {
                //start from col 0
                int r = i;
                int c = 0;
                while (r >= 0 && c < matrix[i].length){
                    System.out.print(matrix[r][c] + " ");
                    r--;
                    c++;
                }
                System.out.println();
            }

        }
    }
}
