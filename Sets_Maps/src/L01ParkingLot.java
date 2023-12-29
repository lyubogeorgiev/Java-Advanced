import java.util.*;

public class L01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parkingLot = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while (!input.equals("END")){
            String[] inputTokens = input.split(", ");

            String command = inputTokens[0];
            String plateNumber = inputTokens[1];

            if (command.equals("IN")){
                parkingLot.add(plateNumber);
            } else {
                parkingLot.remove(plateNumber);
            }

            input = scanner.nextLine();
        }

        if (parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            for (String s : parkingLot) {
                System.out.println(s);
            }
        }
    }
}
