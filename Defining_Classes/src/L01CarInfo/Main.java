package L01CarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Car car = new Car();

//        car.setBrand("Chevrolet");
//        car.setModel("Impala");
//        car.setHorsepower(390);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String brand = tokens[0];
            String model = tokens[1];
            int hp = Integer.parseInt(tokens[2]);

            Car car = new Car(brand, model, hp);

            System.out.println(car.carInfo());
        }

//        System.out.println(String.format("The car is: %s %s - %d HP",
//                car.getBrand(),
//                car.getModel(),
//                car.getHorsepower()));

//        System.out.println(car.carInfo());
    }
}
