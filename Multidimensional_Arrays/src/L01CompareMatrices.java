import java.util.Arrays;
import java.util.Scanner;

public class L01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstMatrixInput = scanner.nextLine().split("\\s+");
        int mFirst = Integer.parseInt(firstMatrixInput[0]);
        int nFirst = Integer.parseInt(firstMatrixInput[1]);

        int[][] firstMatrix = new int[mFirst][];

        for (int i = 0; i < mFirst; i++) {
            firstMatrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        String[] secondMatrixInput = scanner.nextLine().split("\\s+");

        int mSecond = Integer.parseInt(secondMatrixInput[0]);
        int nSecond = Integer.parseInt(secondMatrixInput[1]);

        int[][] secondMatrix = new int[mSecond][];

        for (int i = 0; i < mSecond; i++) {
            secondMatrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        String result = areEqual(firstMatrix, secondMatrix) ? "equal" : "not equal";
        System.out.println(result);
    }

    public static boolean areEqual(int[][] firstMatrix, int[][] secondMatrix){
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }

        for (int i = 0; i < firstMatrix.length; i++) {
            if (firstMatrix[i].length != secondMatrix[i].length){
                return false;
            }

            for (int j = 0; j < firstMatrix[i].length; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
}