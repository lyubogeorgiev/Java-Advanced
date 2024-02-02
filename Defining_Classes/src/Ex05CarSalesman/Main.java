package Ex05CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Engine> engines = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");


            Engine engine = createEngine(tokens);

            engines.put(tokens[0], engine);
        }

        int m = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < m; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            Car car = createCar(tokens, engines);
            cars.put(tokens[0], car);
        }

        for (Map.Entry<String, Car> car : cars.entrySet()) {
            System.out.println(car.getValue());
        }
    }

    private static Engine createEngine(String[] tokens) {
        String model = tokens[0];
        int power = Integer.parseInt(tokens[1]);
        String displacement = "n/a";
        String efficiency = "n/a";

        if (tokens.length > 2){
            if (Character.isDigit(tokens[2].charAt(0))){

                displacement = tokens[2];
            } else {
                efficiency = tokens[2];
            }
        }

        if (tokens.length > 3){
            if (Character.isDigit(tokens[3].charAt(0))){

                displacement = tokens[3];
            } else {
                efficiency = tokens[3];
            }
        }

        return new Engine(model, power, displacement, efficiency);
    }

    private static Car createCar(String[] tokens, Map<String, Engine> engines){
        String model = tokens[0];
        Engine engine = engines.get(tokens[1]);
        double weight = -1.0;
        String color = "n/a";

        if (tokens.length > 2){
            if (Character.isDigit(tokens[2].charAt(0))){

                weight = Double.parseDouble(tokens[2]);
            } else {
                color = tokens[2];
            }
        }

        if (tokens.length > 3){
            if (Character.isDigit(tokens[3].charAt(0))){

                weight = Double.parseDouble(tokens[3]);
            } else {
                color = tokens[3];
            }
        }

        return new Car(model, engine, weight, color);
    }
}
