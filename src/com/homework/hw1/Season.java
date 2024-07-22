package com.homework.hw1;

import java.util.Scanner;

public class Season {

    public void timeOfTheYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название месяца:");
        String month = sc.next().toLowerCase().trim();
        String seas;
        switch (month) {
            case "январь":
            case "февраль":
            case "декабрь":
                seas = "зимний месяц";
                System.out.println(month + " - " + seas);
                break;
            case "март":
            case "апрель":
            case "май":
                seas = "веснний месяц";
                System.out.println(month + " - " + seas);
                break;
            case "июнь":
            case "июль":
            case "август":
                seas = "летний месяц";
                System.out.println(month + " - " + seas);
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                seas = "осенний месяц";
                System.out.println(month + " - " + seas);
                break;
            default:
                seas = "такого месяца нет";
                System.out.println(month + " - " + seas);
        }
    }
}