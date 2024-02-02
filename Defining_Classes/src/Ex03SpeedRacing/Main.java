package Ex03SpeedRacing;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String model = tokens[0];
            double fuelAmount = Double.parseDouble(tokens[1]);
            double fuelCostForOneKm = Double.parseDouble(tokens[2]);

            cars.put(model, new Car(model, fuelAmount, fuelCostForOneKm));
        }

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] tokens = command.split("\\s+");

            String model = tokens[1];
            double distanceToTravel = Double.parseDouble(tokens[2]);

            //drive the current car for the km needed

            boolean canDrive = cars.get(model).drive(distanceToTravel);

            if (!canDrive){
                System.out.println("Insufficient fuel for the drive");
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, Car> car : cars.entrySet()) {
            System.out.printf("%s %.2f %.0f%n",
                    car.getKey(),
                    car.getValue().getFuelAmount(),
                    car.getValue().getDistanceTraveled());
        }
    }
}
