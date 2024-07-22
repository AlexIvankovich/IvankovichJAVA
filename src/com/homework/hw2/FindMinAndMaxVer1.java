package com.homework.hw2;

import java.util.Arrays;

public class FindMinAndMaxVer1 {
    public void findMinNMax () {
    int arr[] = new int[]{28, 2, 17, 1, -4, 9, 105};
    int min = arr[0];
    int max = arr[0];

      for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) max = arr[i];
        else if (arr[i] < min) min = arr[i];
      }
      System.out.println("В массиве " + Arrays.toString(arr) + " минимальное значение: " + min + "; максимальное значение: " + max);
    }
}