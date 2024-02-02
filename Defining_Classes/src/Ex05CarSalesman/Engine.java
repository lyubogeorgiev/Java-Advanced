package Ex05CarSalesman;

public class Engine {

    private String model;
    private int power;
    private String displacement;
    private String efficiency;

    public Engine(String model, int power, String displacement, String efficiency){
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {

        return this.model + ":" + System.lineSeparator() +
                "Power: " + this.power + System.lineSeparator() +
                "Displacement: " + this.displacement + System.lineSeparator() +
                "Efficiency: " + this.efficiency + System.lineSeparator();
    }
}
