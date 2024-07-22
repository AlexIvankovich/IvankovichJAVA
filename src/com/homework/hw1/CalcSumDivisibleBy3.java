package com.homework.hw1;

import java.util.Scanner;

public class CalcSumDivisibleBy3 {

    public void calculateSum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        int num1 = sc.nextInt();

        System.out.println("Введите второе число");
        int num2 = sc.nextInt();

        int start = Math.min(num1,num2);
        int end = Math.max(num1,num2);

        int sum = 0;

        for (int i = start+1; i<end; i++) {
            if (i%3==0){
                sum +=i;
            }
        }
        System.out.println("Сумма делящихся на 3 чисел, которые находятся в промежутке между " + start + " и " + end + " равна " + sum);
    }
}