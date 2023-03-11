package t02MultidimensionalArrays;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
//        int student1 = 1;
//        int student2 = 2;
//        int student3 = 3;
//        int student4 = 4;
//        int student5 = 5;

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //this is the array,the way to save multiple variables of the same type
        int[] studentNumbers = new int[n];

        for (int i = 0; i < studentNumbers.length; i++) {
            studentNumbers[i] = i;
        }

        for (int studentNumber : studentNumbers) {
            System.out.println(studentNumber);
        }

//        int[] studentNumbers = {
//                12,
//                10,
//                30
//        };

//        int[][] multiArr= {
//                new int[]{1, 2, 3, 4},
//                new int[]{5, 6 , 7, 8},
//                new int[]{9, 10, 11, 12}
//        };

        int[] firstArr = {13, 46};
        int[] secondArr = {69, 73};

        int[][] thirdArr = {
                firstArr,
                secondArr
        };
        System.out.printf("The length of the array is: %d",studentNumbers.length);

        int[][] matrix= new int[3][]; //you can initialize only the number of rows first
        String[][][] stringCube = new String[3][][]; // you have to always initialize at least the first dimension
    }
}
