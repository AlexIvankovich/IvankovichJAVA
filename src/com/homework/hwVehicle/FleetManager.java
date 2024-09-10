package com.homework.hwVehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FleetManager {
    private List<Vehicle> vehicles;
    private List<Driver> drivers;
    private List<Trip> trips;

    public FleetManager() {
        vehicles = new ArrayList<>();
        drivers = new ArrayList<>();
        trips = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void planTrip(Trip trip) throws VehicleNotFoundException, DriverNotFoundException {
        if (!vehicles.contains(trip.getVehicle())) {
            throw new VehicleNotFoundException("Vehicle not found");
        }
        if (!drivers.contains(trip.getDriver())) {
            throw new DriverNotFoundException("Driver not found");
        }
        trips.add(trip);
        trip.getVehicle().drive(trip.getDistance());
    }

    public List<Vehicle> getAvailableVehicles() {
        return vehicles.stream()
                .filter(vehicle -> trips.stream().noneMatch(trip -> trip.getVehicle().equals(vehicle)))
                .collect(Collectors.toList());
    }

    public List<Driver> getAvailableDriver() {
        return drivers.stream()
                .filter(driver -> trips.stream().noneMatch(trip -> trip.getDriver().equals(driver)))
                .collect(Collectors.toList());
    }

    public List<Trip> getTripsForVehicles(int vehicleId) throws VehicleNotFoundException {
        Vehicle vehicle = findVehicleById(vehicleId);
        List<Trip> vehicleTrips = new ArrayList<>();
        for (Trip trip : trips) {
            if (trip.getVehicle().getId() == vehicle.getId()) {
                vehicleTrips.add(trip);
            }
        }

        return vehicleTrips;

    }

    private Vehicle findVehicleById(int vehicleId) throws VehicleNotFoundException {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == vehicleId) {
                return vehicle;
            }
        }
        throw new VehicleNotFoundException("Vehicle with ID " + vehicleId + " not found");
    }
}
