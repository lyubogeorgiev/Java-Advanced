package Ex03SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostForOneKm;
    private double distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCostForOneKm){
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostForOneKm = fuelCostForOneKm;
        this.distanceTraveled = 0.0;
    }

    public boolean drive(double kmToDrive){
        double fuelNeeded = kmToDrive * this.fuelCostForOneKm;

        if (fuelNeeded <= this.fuelAmount){
            this.fuelAmount -= fuelNeeded;
            this.distanceTraveled += kmToDrive;

            return true;
        }

        return false;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }
}
