package com.homework.hw4;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String personInfo() {
        return "Имя сотрудника: " + name + " Фамилия:" + surname;
    }


}
