package com.homework.hwVehicle;

public class Truck extends Vehicle implements Driveable {

    private double loadCapacity;

    public Truck(int id, String make, String model, int year, int mileage, double loadCapacity) {
        super(id, make, model, year, mileage);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine stopped");
    }

    @Override
    public void drive(int distance) {
        System.out.println("Truck driven " + distance + " km");
        this.mileage += distance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Truck{");
        sb.append("loadCapacity=").append(loadCapacity);
        sb.append(", id=").append(id);
        sb.append(", make='").append(make).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", year=").append(year);
        sb.append(", mileage=").append(mileage);
        sb.append('}');
        return sb.toString();
    }
}
