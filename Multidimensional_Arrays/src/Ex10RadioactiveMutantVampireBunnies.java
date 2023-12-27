import java.util.Arrays;
import java.util.Scanner;

public class Ex10RadioactiveMutantVampireBunnies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(dimensions[0]);
        int m = Integer.parseInt(dimensions[1]);

        char[][] lair = new char[n][m];

        int playerRow = -1;
        int playerCol = -1;

        boolean isPlayerAlive = true;
        boolean isGameOn = true;

        for (int i = 0; i < lair.length; i++) {
            lair[i] = scanner.nextLine().toCharArray();

            for (int j = 0; j < lair[i].length; j++) {
                if (lair[i][j] == 'P'){
                    playerRow = i;
                    playerCol = j;
                }
            }
        }

        char[][] secondLair = new char[n][m];

        for (int i = 0; i < lair.length; i++) {
            secondLair[i] = Arrays.copyOf(lair[i], lair[i].length);
        }

        String commands = scanner.nextLine();

        for (int i = 0; i < commands.length(); i++) {
            char currentCommand = commands.charAt(i);

            if (!isGameOn){
                break;
            }

            if (currentCommand == 'L'){
                //player moving left
                if (playerCol - 1 >= 0){
                    if (secondLair[playerRow][playerCol - 1] == '.'){
                        secondLair[playerRow][playerCol] = '.';
                        secondLair[playerRow][playerCol - 1] = 'P';
                        playerCol -= 1;
                    } else {
                        secondLair[playerRow][playerCol] = '.';
                        playerCol -= 1;
                        isPlayerAlive = false;
                    }

                } else {
                    secondLair[playerRow][playerCol] = '.';
                    isGameOn = false;
                }
            } else if (currentCommand == 'R'){
                //player moving to the right
                if (playerCol + 1 < secondLair[playerRow].length){
                    if (secondLair[playerRow][playerCol + 1] == '.'){
                        secondLair[playerRow][playerCol] = '.';
                        secondLair[playerRow][playerCol + 1] = 'P';
                        playerCol += 1;
                    } else {
                        secondLair[playerRow][playerCol] = '.';
                        playerCol += 1;
                        isPlayerAlive = false;
                    }

                } else if (playerCol + 1 >= secondLair[playerRow].length){
                    secondLair[playerRow][playerCol] = '.';
                    isGameOn = false;
                }
            } else if (currentCommand == 'U'){
                //player moving up
                if (playerRow - 1 >= 0){
                    if (secondLair[playerRow - 1][playerCol] == '.'){
                        secondLair[playerRow][playerCol] = '.';
                        secondLair[playerRow - 1][playerCol] = 'P';
                        playerRow -= 1;
                    } else {
                        secondLair[playerRow][playerCol] = '.';
                        playerRow -= 1;
                        isPlayerAlive = false;
                    }

                } else {
                    secondLair[playerRow][playerCol] = '.';
                    isGameOn = false;
                }
            } else if (currentCommand == 'D'){
                //player moving down
                if (playerRow + 1 < secondLair.length){
                    if (secondLair[playerRow + 1][playerCol] == '.'){
                        secondLair[playerRow][playerCol] = '.';
                        secondLair[playerRow + 1][playerCol] = 'P';
                        playerRow += 1;
                    } else {
                        secondLair[playerRow][playerCol] = '.';
                        playerRow += 1;
                        isPlayerAlive = false;
                    }

                } else if (playerRow + 1 >= secondLair.length){
                    secondLair[playerRow][playerCol] = '.';
                    isGameOn = false;
                }
            }

            //loop through the array and multiply bunnies and put the new bunnies only into the second array
            for (int j = 0; j < lair.length; j++) {
                for (int k = 0; k < lair[j].length; k++) {
                    if (lair[j][k] == 'B'){
                        //multiply to left
                        if (k - 1 >= 0){
                            if (lair[j][k - 1] == 'P'){
                                isPlayerAlive = false;
                            }
                            secondLair[j][k - 1] = 'B';
                        }
                        //multiply to right
                        if (k + 1 < lair[j].length){
                            if (lair[j][k + 1] == 'P'){
                                isPlayerAlive = false;
                            }
                            secondLair[j][k + 1] = 'B';
                        }
                        //multiply to up
                        if (j - 1 >= 0){
                            if (lair[j - 1][k] == 'P'){
                                isPlayerAlive = false;
                            }
                            secondLair[j - 1][k] = 'B';
                        }
                        //multiply to down
                        if (j + 1 < lair.length){
                            if (lair[j + 1][k] == 'P'){
                                isPlayerAlive = false;
                            }
                            secondLair[j + 1][k] = 'B';
                        }
                    }
                }
            }

            for (int l = 0; l < lair.length; l++) {
                lair[l] = Arrays.copyOf(secondLair[l], secondLair[l].length);
            }

            if (!isPlayerAlive) {
                break;
            }

        }

        for (int i = 0; i < lair.length; i++) {
            for (int j = 0; j < lair[i].length; j++) {
                System.out.print(lair[i][j]);
            }
            System.out.println();
        }

        if (isPlayerAlive){
            System.out.print("won: ");
        } else {
            System.out.print("dead: ");
        }

        System.out.println(playerRow + " " + playerCol);
    }
}
