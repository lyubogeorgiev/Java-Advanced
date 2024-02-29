package Ex07Google;

public class Car {
    private final String model;
    private final int speed;

    public Car(String model, int speed){
        this.model = model;
        this.speed = speed;
    }

    public String getModel(){
        return this.model;
    }

    public int getSpeed(){
        return this.speed;
    }

    @Override
    public String toString() {
        return String.format("%n%s %d",
                this.model,
                this.speed);
    }
}
