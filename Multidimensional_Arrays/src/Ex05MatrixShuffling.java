import java.util.Arrays;
import java.util.Scanner;

public class Ex05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = dimensions[0];
        int m = dimensions[1];

        String[][] matrix = new String[n][m];

        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }

        String input = scanner.nextLine();

        while (!input.equals("END")){
            String[] inputTokens = input.split("\\s+");

            if (isValidCommand(inputTokens, n, m)){
                int row1 = Integer.parseInt(inputTokens[1]);
                int col1 = Integer.parseInt(inputTokens[2]);
                int row2 = Integer.parseInt(inputTokens[3]);
                int col2 = Integer.parseInt(inputTokens[4]);

                String tempValue = matrix[row1][col1];
                matrix[row1][col1] = matrix[row2][col2];
                matrix[row2][col2] = tempValue;

                printMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }

            input = scanner.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            System.out.println(String.join(" ", strings));
        }
    }

    private static boolean isValidCommand(String[] inputTokens, int n, int m) {
        String command = inputTokens[0];

        if (!command.equals("swap")){
            return false;
        }

        int row1;
        int col1;
        int row2;
        int col2;

        try {
            row1 = Integer.parseInt(inputTokens[1]);
            col1 = Integer.parseInt(inputTokens[2]);
            row2 = Integer.parseInt(inputTokens[3]);
            col2 = Integer.parseInt(inputTokens[4]);
        }catch (Exception exception){
            return false;
        }

        return row1 >= 0 && row1 < n && row2 >= 0 && row2 < m && col1 >= 0 && col1 < n && col2 >= 0 && col2 < n;
    }
}
