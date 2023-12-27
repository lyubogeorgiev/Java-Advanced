import java.util.Arrays;
import java.util.Scanner;

public class Ex12TheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(dimensions[0]);
        int m = Integer.parseInt(dimensions[1]);

        char[][] matrix = new char[n][m];

        for (int i = 0; i < matrix.length; i++) {
            String[] tempInput = scanner.nextLine().split("\\s+");
            for (int j = 0; j < tempInput.length; j++) {
                matrix[i][j] = tempInput[j].charAt(0);
            }
        }

        char fillingChar = scanner.nextLine().charAt(0);

        String[] startPosition = scanner.nextLine().split("\\s+");

        int startRow = Integer.parseInt(startPosition[0]);
        int startCol = Integer.parseInt(startPosition[1]);

        char startChar = matrix[startRow][startCol];
        matrix[startRow][startCol] = fillingChar;

        for (int i = startRow; i < matrix.length; i++) {
            for (int j = startCol; j < matrix[i].length; j++) {
                //4 directions to check if equals to startChar. If some char doesn't equal, then break;

                //going left
                for (int k = j - 1; k >= 0; k--) {
                    if (matrix[i][k] == startChar && matrix[i][k + 1] == fillingChar){
                        matrix[i][k] = fillingChar;
                    } else {
                        break;
                    }
                }

                //going right
                for (int k = j + 1; k < matrix[i].length; k++) {
                    if (matrix[i][k] == startChar && matrix[i][k - 1] == fillingChar){
                        matrix[i][k] = fillingChar;
                    } else {
                        break;
                    }
                }

                //going up
                for (int k = i - 1; k >= 0 ; k--) {
                    if (matrix[k][j] == startChar && matrix[k + 1][j] == fillingChar){
                        matrix[k][j] = fillingChar;
                    } else {
                        break;
                    }
                }

                //going down
                for (int k = i + 1; k < matrix.length; k++) {
                    if (matrix[k][j] == startChar && matrix[k - 1][j] == fillingChar){
                        matrix[k][j] = fillingChar;
                    } else {
                        break;
                    }
                }
            }
        }

        for (char[] row : matrix) {
            for (char currentChar : row) {
                System.out.print(currentChar);
            }
            System.out.println();
        }
    }
}
