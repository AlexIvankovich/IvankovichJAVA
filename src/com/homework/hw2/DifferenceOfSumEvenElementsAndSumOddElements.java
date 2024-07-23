package com.homework.hw2;

import java.util.Arrays;
import java.util.Scanner;

public class DifferenceOfSumEvenElementsAndSumOddElements {
    public void difOfSumEvenAndSumOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int elementValue = sc.nextInt();
        int arr[] = new int[elementValue];
        for (int numElement = 0; numElement < arr.length; numElement++) {
            System.out.println("Введите значение " + numElement + " элемента массива");
            arr[numElement] = sc.nextInt();
            System.out.println("Значения элементов в массиве " + Arrays.toString(arr));

            int j = 1;
            int sumEven = 0;
            for (j=1; j < arr.length; j=j+2) {
                    sumEven += arr[j];
            }
            int k = 0;
            int sumOdd = 0;
            for (k=0; k < arr.length; k=k+2) {
                sumOdd += arr[k];
            }
            int difEvenOdd = sumEven - sumOdd;

            System.out.println("Сумма элементов в массиве, стоящих на четных местах " + sumEven);
            System.out.println("Сумма элементов в массиве, стоящих на нечетных местах " + sumOdd);
            System.out.println("Разница сумм элементов в массиве, стоящих на четных и нечетных местах " + difEvenOdd);
        }
    }
}
