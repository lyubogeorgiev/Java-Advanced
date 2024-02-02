package Ex04RawData;

public class Cargo {
    private double cargoWeight;
    private String cargoType;

    public Cargo(double cargoWeight, String cargoType){
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }

    public String getCargoType(){
        return this.cargoType;
    }
}
