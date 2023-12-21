import java.util.Scanner;

public class Ex02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        String[][] matrix = new String[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = String.valueOf((char) (97 + i)) + (char) (97 + i + j) + (char) (97 + i);
            }
        }

        for (String[] strings : matrix) {
            for (int i = 0; i < strings.length; i++) {
                System.out.print(strings[i]);

                if (i != strings.length - 1){
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}