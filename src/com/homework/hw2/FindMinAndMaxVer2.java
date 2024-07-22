package com.homework.hw2;

import java.util.Arrays;

public class FindMinAndMaxVer2 {
    int[] arr = {1, 2, 3, 4, 125, 6, 7, 28, -9, 5, 11, 12, 13, 14, 15};
    public void findMin() {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println( "Минимальное значение в массиве " + Arrays.toString(arr) + " равно " + min);
    }
    public void findMax() {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
                }
        }
        System.out.println("Максимальное значение в массиве " + Arrays.toString(arr) + " равно " + max);
    }
}