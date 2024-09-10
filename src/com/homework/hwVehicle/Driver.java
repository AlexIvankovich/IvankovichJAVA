package com.homework.hwVehicle;

public class Driver {

    private int id;

    private String firstName;

    private String lastName;

    private int age;

    private String licenseCategory;

    public Driver(int id, String firstName, String lastName, int age, String licenseCategory) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.licenseCategory = licenseCategory;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getLicenseCategory() {
        return licenseCategory;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Driver{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append(", licenseCategory='").append(licenseCategory).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
