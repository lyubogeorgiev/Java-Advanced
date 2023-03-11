package t02MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int n = dimensions[0];
        int m = dimensions[1];
        int[][] first = new int[n][m];

//        for (int i = 0; i < m; i++) {
//            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//
//            first[i] = arr;
//        }

        for (int row = 0; row < first.length; row++) {
            for (int col = 0; col < first[row].length; col++) {
                first[row][col] = scanner.nextInt();
            }
        }

        for (int row = 0; row < first.length; row++) {
            for (int col = 0; col < first[row].length; col++) {
                System.out.print(first[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
