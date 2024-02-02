package Ex04RawData;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire[] tires;

    public Car(String model, Engine engine, Cargo cargo, Tire tireOne, Tire tireTwo, Tire tireThree, Tire tireFour){
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = new Tire[]{tireOne, tireTwo, tireThree, tireFour};
    }

    public String getModel(){
        return this.model;
    }

    public Cargo getCargo(){
        return cargo;
    }

    public Tire[] getTires(){
        return this.tires;
    }

    public Engine getEngine(){
        return this.engine;
    }
}
