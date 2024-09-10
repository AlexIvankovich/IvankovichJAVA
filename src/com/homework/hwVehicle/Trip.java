package com.homework.hwVehicle;

import java.time.LocalDate;

public class Trip {

    private int id;

    private Vehicle vehicle;

    private Driver driver;

    private LocalDate startDate;

    private LocalDate endDate;

    private int distance;

    public Trip(int id, Vehicle vehicle, Driver driver, LocalDate startDate, LocalDate endDate, int distance) {
        this.id = id;
        this.vehicle = vehicle;
        this.driver = driver;
        this.startDate = startDate;
        this.endDate = endDate;
        this.distance = distance;
    }

    public int getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Driver getDriver() {
        return driver;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Trip{");
        sb.append("id=").append(id);
        sb.append(", vehicle=").append(vehicle);
        sb.append(", driver=").append(driver);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", distance=").append(distance);
        sb.append('}');
        return sb.toString();
    }
}
