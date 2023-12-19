import java.util.Scanner;

public class L07FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[8][8];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }

        int validQueenRow = -1;
        int validQueenCol = -1;

        for (int i = 0; i < matrix.length; i++) {
            if (validQueenCol != -1 && validQueenRow != -1){
                break;
            }

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("q")
                        && isValidRow(matrix, i, j)
                        && isValidCol(matrix, i, j)
                        && isValidMainDiagonal(matrix, i, j)
                        && isValidSecondDiagonal(matrix, i , j)){
                    validQueenRow = i;
                    validQueenCol = j;

                    break;
                }
            }
        }

        System.out.println(validQueenRow + " " + validQueenCol);
    }

    public static boolean isValidRow(String[][] matrix, int row, int col){
        for (int i = 0; i < matrix[row].length; i++) {
            if (i != col && matrix[row][col].equals(matrix[row][i])){
                return false;
            }
        }
        return true;
    }

    public static boolean isValidCol(String[][] matrix, int row, int col){
        for (int i = 0; i < matrix.length; i++) {
            if (i != row && matrix[i][col].equals(matrix[row][col])){
                return false;
            }
        }
        return true;
    }

    public static boolean isValidMainDiagonal(String[][] matrix, int row, int col){
        //upper main diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if ((row != i || col != j) && matrix[i][j].equals(matrix[row][col])){
                return false;
            }
        }

        //lower main diagonal
        for (int i = row, j = col; i < matrix.length && j < matrix.length; i++, j++) {
            if ((row != i || col != j) && matrix[i][j].equals(matrix[row][col])){
                return false;
            }
        }

        return true;
    }

    public static boolean isValidSecondDiagonal(String[][] matrix, int row, int col){

        for (int i = row, j = col; i >= 0 && j < matrix.length; i--, j++) {
            if ((row != i || col != j) && matrix[i][j].equals(matrix[row][col])){
                return false;
            }
        }

        for (int i = row, j = col; i < matrix.length && j >= 0; i++, j--) {
            if ((row != i || col != j) && matrix[i][j].equals(matrix[row][col])){
                return false;
            }
        }
        return true;
    }
}
