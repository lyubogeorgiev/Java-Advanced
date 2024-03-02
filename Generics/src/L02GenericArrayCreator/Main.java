package L02GenericArrayCreator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] intArr = ArrayCreator.create(2, 2);

        Arrays.stream(intArr).forEach(System.out::println);

        Double[] doubleArr = ArrayCreator.<Double>create(Double.class, 3, 2.5);
        Arrays.stream(doubleArr).forEach(System.out::println);
    }
}
