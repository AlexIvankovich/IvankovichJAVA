package com.homework.hw1;

import java.util.Scanner;

public class VowelOrConsonantsSwitchTest {

    public void vowelAlphabet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите букву английского алфавита:");
        char letter = sc.next().toLowerCase().trim().charAt(0);
        if (letter >='a' && letter <='z' ) {
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    System.out.println(letter + " - гласная буква английского алфавита");
                    break;
                default:
                    System.out.println(letter + " - согласная буква английского алфавита");
            }
        } else
            System.out.println(letter + " - не буква английского алфавита");
    }
}