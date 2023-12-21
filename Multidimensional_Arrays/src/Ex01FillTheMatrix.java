import java.util.Scanner;

public class Ex01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");

        int n = Integer.parseInt(tokens[0]);
        String fillingMethod = tokens[1];

        int[][] matrix = new int[n][n];
        int matrixValue = 1;

        if (fillingMethod.equals("A")){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[j][i] = matrixValue++;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0){
                    for (int j = 0; j < n; j++) {
                        matrix[j][i] = matrixValue++;
                    }
                } else {
                    for (int j = matrix[i].length - 1; j >= 0 ; j--) {
                        matrix[j][i] = matrixValue++;
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);

                if (j != matrix[i].length - 1){
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
