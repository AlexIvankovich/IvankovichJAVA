package com.homework.hwVehicle;

public abstract class Vehicle {

    protected int id;

    protected String make;

    protected String model;

    protected int year;

    protected int mileage;

    public Vehicle(int id, String make, String model, int year, int mileage) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    abstract void drive(int distance);

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("id=").append(id);
        sb.append(", make='").append(make).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", year=").append(year);
        sb.append(", mileage=").append(year);
        sb.append('}');
        return sb.toString();
    }
}
