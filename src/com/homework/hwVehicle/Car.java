package com.homework.hwVehicle;

public class Car extends Vehicle implements Driveable {

    private int numberOfSeats;

    public Car(int id, String make, String model, int year, int mileage, int numberOfSeats) {
        super(id, make, model, year, mileage);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }

    @Override
    public void drive(int distance) {
        System.out.println("Car driven " + distance + " km");
        this.mileage += distance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("numberOfSeats=").append(numberOfSeats);
        sb.append(", id=").append(id);
        sb.append(", make='").append(make).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", year=").append(year);
        sb.append(", mileage=").append(mileage);
        sb.append('}');
        return sb.toString();
    }
}
