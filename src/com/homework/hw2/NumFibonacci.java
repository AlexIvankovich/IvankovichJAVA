package com.homework.hw2;

import java.util.Arrays;
import java.util.Scanner;

public class NumFibonacci {
    public void numFib () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int amountOfElements = sc.nextInt();

        int[] arrFib = new int[amountOfElements];
        arrFib[0] = 0;
        arrFib[1] = 1;
        for (int i = 2; i < amountOfElements; ++i) {
            arrFib[i] = arrFib[i - 1] + arrFib[i - 2];
        }
      System.out.println("В массив из " + amountOfElements + " элементов цифр Фибоначчи входят " + Arrays.toString(arrFib));
    }
}
