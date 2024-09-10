package com.homework.hwVehicle;

public class Bus extends Vehicle implements Driveable {

    private int passengersCapacity;

    public Bus(int id, String make, String model, int year, int mileage, int passengersCapacity) {
        super(id, make, model, year, mileage);
        this.passengersCapacity = passengersCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Bus engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bus engine stopped");
    }

    @Override
    public void drive(int distance) {
        System.out.println("Bus driven " + distance + " km");
        this.mileage += distance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bus{");
        sb.append("passengersCapacity=").append(passengersCapacity);
        sb.append(", id=").append(id);
        sb.append(", model='").append(model).append('\'');
        sb.append(", make='").append(make).append('\'');
        sb.append(", year=").append(year);
        sb.append(", mileage=").append(mileage);
        sb.append('}');
        return sb.toString();
    }
}
