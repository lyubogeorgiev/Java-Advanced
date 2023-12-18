import java.util.Arrays;
import java.util.Scanner;

public class L02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = n[0];

        int[][] numbers = new int[rows][];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int searchedNumber = Integer.parseInt(scanner.nextLine());
        boolean isNumberFound = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == searchedNumber){
                    System.out.println(i + " " + j);
                    isNumberFound = true;
                }
            }
        }

        if (!isNumberFound){
            System.out.println("not found");
        }
    }
}
