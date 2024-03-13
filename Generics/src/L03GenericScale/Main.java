package L03GenericScale;

public class Main {
    public static void main(String[] args) {
        Scale<String> firstScale = new Scale<>("left", "right");
        System.out.println(firstScale.getHeavier());

        Scale<Double> doubleScale = new Scale<>(22.2, 33.3);
        System.out.println(doubleScale.getHeavier());
    }
}
