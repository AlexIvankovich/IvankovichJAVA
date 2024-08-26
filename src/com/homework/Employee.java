package com.homework.hw4;

public abstract class Employee extends Person{

    private int workExperience;

    public Employee(String name, String surname) {
        super(name, surname);
    }

    public abstract PROF getPROF();

    public int printSalary(){
        return 1000*workExperience*getPROF().getKoef();
    }

}
