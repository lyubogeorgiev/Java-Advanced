package Ex05CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private double weight;
    private String color;

    public Car(String model, Engine engine, double weight, String color){
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine, double weight){
        this(model, engine, weight, "N/A");
    }

    public Car(String model, Engine engine){
        this(model, engine, -1.0, "N/A");
    }

    @Override
    public String toString() {
        String weight = String.format("%.0f", this.weight);

        if (this.weight == -1.0){
            weight = "n/a";
        }
        return this.model + ":" + System.lineSeparator() + this.engine
                + "Weight: " + weight + System.lineSeparator()
                + "Color: " + this.color;
    }
}
