package Ex04RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            cars.add(createCar(tokens));
        }

        String command = scanner.nextLine();

        Predicate<Car> secondFilterCondition = getCarPredicate(command);

        cars
                .stream()
                .filter(c -> c.getCargo().getCargoType().equals(command))
                .filter(secondFilterCondition)
                .forEach(c -> System.out.printf("%s%n", c.getModel()));

    }

    private static Predicate<Car> getCarPredicate(String command) {
        Predicate<Car> secondFilterCondition;

        if (command.equals("flamable")){
            secondFilterCondition = car -> {
                return car.getEngine().getEnginePower() > 250;
            };
        } else {
            secondFilterCondition = car -> {
                Tire[] tires = car.getTires();

                for (Tire tire : tires) {
                    if (tire.getPressure() < 1){
                        return true;
                    }
                }

                return false;
            };
        }
        return secondFilterCondition;
    }

    public static Car createCar(String[] tokens){
        String model = tokens[0];
        int engineSpeed = Integer.parseInt(tokens[1]);
        int enginePower = Integer.parseInt(tokens[2]);
        double cargoWeight = Double.parseDouble(tokens[3]);
        String cargoType = tokens[4];
        double tireOnePressure = Double.parseDouble(tokens[5]);
        int tireOneAge = Integer.parseInt(tokens[6]);
        double tireTwoPressure = Double.parseDouble(tokens[7]);
        int tireTwoAge = Integer.parseInt(tokens[8]);
        double tireThreePressure = Double.parseDouble(tokens[9]);
        int tireThreeAge = Integer.parseInt(tokens[10]);
        double tireFourPressure = Double.parseDouble(tokens[11]);
        int tireFourAge = Integer.parseInt(tokens[12]);

        Engine engine = new Engine(engineSpeed, enginePower);
        Cargo cargo = new Cargo(cargoWeight, cargoType);
        Tire tireOne = new Tire(tireOnePressure, tireOneAge);
        Tire tireTwo = new Tire(tireTwoPressure, tireTwoAge);
        Tire tireThree = new Tire(tireThreePressure, tireThreeAge);
        Tire tireFour = new Tire(tireFourPressure, tireFourAge);

        return new Car(model, engine, cargo, tireOne, tireTwo, tireThree, tireFour);
    }
}
