import java.util.Arrays;
import java.util.Scanner;

public class Ex09ParkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parkingDimensions = scanner.nextLine().split("\\s+");

        int r = Integer.parseInt(parkingDimensions[0]);
        int c = Integer.parseInt(parkingDimensions[1]);

        String[][] parkingLot = new String[r][c];

        for (String[] strings : parkingLot) {
            Arrays.fill(strings, "E");
        }

        String input = scanner.nextLine();

        while (!input.equals("stop")){
            String[] inputTokens = input.split("\\s+");

            //entry row
            int z = Integer.parseInt(inputTokens[0]);

            //desired parking coordinates
            int x = Integer.parseInt(inputTokens[1]);
            int y = Integer.parseInt(inputTokens[2]);

            int distanceTraveled = Math.abs(z - x);

            boolean isCarParked = false;

            for (int i = 0; i < parkingLot[x].length; i++) {
                if (i == y){
                    if (!parkingLot[x][i].equals("X")){
                        parkingLot[x][i] = "X";
                        distanceTraveled += i + 1;
                        isCarParked = true;
                        break;
                    } else {
                        //search for the closest empty space
                        int distanceFromBeginning = c;
                        int distanceFromDesiredSpot = c;

                        int alternativeSpotC = -1;

                        for (int j = 1; j < parkingLot[x].length; j++) {
                            if (!parkingLot[x][j].equals("X")){
                                int currentDistanceFromDesiredSpot = Math.abs(y - j);
                                if ((currentDistanceFromDesiredSpot < distanceFromDesiredSpot)
                                        || (j < distanceFromBeginning
                                        && currentDistanceFromDesiredSpot == distanceFromDesiredSpot)){
                                    alternativeSpotC = j;
                                    isCarParked = true;
                                    distanceFromBeginning = j + 1;
                                    distanceFromDesiredSpot = Math.abs(j - y);
                                }
                            }
                        }

                        if (isCarParked && alternativeSpotC != -1){
                            distanceTraveled += distanceFromBeginning;
                            parkingLot[x][alternativeSpotC] = "X";
                        }
                    }
                }
            }

            if (isCarParked){
                System.out.println(distanceTraveled);
            } else {
                System.out.println("Row " + x + " full");
            }

            input = scanner.nextLine();
        }
    }
}
