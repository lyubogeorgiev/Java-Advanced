import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rotateTokens = scanner.nextLine().split("[()]");

//        for (String rotateToken : rotateTokens) {
//            System.out.println(rotateToken);
//        }

        int rotateDeg = Integer.parseInt(rotateTokens[1]);

//        System.out.println(rotateDeg);

        List<String> inputList = new ArrayList<>();
        int longestElement = 0;

        String input = scanner.nextLine();

        while (!input.equals("END")){
            inputList.add(input);
            if (longestElement < input.length()){
                longestElement = input.length();
            }

            input = scanner.nextLine();
        }

        int m = inputList.size();
        int n = longestElement;

        char[][] matrix = new char[m][n];

        for (int i = 0; i < inputList.size(); i++) {
            String currentString = inputList.get(i);

            for (int j = 0; j < longestElement; j++) {
                if (currentString.length() <= j){
                    matrix[i][j] = ' ';
                } else {
                    matrix[i][j] = inputList.get(i).charAt(j);
                }
            }
        }

        int rotationTimes = rotateDeg % 360;

        rotate(matrix, rotationTimes);
    }

    public static void rotate(char[][] matrix, int times){
        if (times == 0){
            for (char[] chars : matrix) {
                for (int j = 0; j < chars.length; j++) {
                    System.out.print(chars[j]);
                }
                System.out.println();
            }
        } else if (times == 90){
            for (int i = 0; i < matrix[0].length; i++) {
                for (int j = matrix.length - 1; j >= 0; j--) {
                    System.out.print(matrix[j][i]);
                }
                System.out.println();
            }
        } else if (times == 180){
            for (int i = matrix.length - 1; i >= 0; i--) {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        } else if (times == 270){
            for (int i = matrix[0].length - 1; i >= 0; i--) {
                for (char[] chars : matrix) {
                    System.out.print(chars[i]);
                }
                System.out.println();
            }
        }
    }
}
