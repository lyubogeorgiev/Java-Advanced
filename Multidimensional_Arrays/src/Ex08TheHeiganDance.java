import java.util.Scanner;

public class Ex08TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double playerDamagePower = Double.parseDouble(scanner.nextLine());

        String[][] field = new String[15][15];

        int[] playerPosition = {8, 8};

        int playerPoints = 18500;
        int heiganPoints = 3000000;

        int plagueCloudDamage = 3500;
        int eruptionDamage = 6000;

        boolean hasActiveCloud = false;

        while (playerPoints > 0 && heiganPoints > 0){
            String[] input = scanner.nextLine().split("\\s+");

            String spell = input[0];
            int row = Integer.parseInt(input[1]);
            int col = Integer.parseInt(input[0]);

            //affected rows
            for (int i = row - 1; i <= row + 1; i++) {
                for (int j = col - 1; j <= col + 1; j++) {
                    if (i >= 0 && i < field.length && j >= 0 && j < field.length){
                        //these rows are affected
                        //here here here here
//                        boolean
                    }
                }
            }
        }
    }

    private static void isThereDamageToPlayer(int[] playerPosition, int i, int j) {
        int playerRow = playerPosition[0];
        int playerCol = playerPosition[1];

        boolean playerDamagedAtThisPosition = false;


    }
}
