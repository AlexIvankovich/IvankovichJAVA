package com.homework.hw1;

import java.util.Scanner;

public class VowelOrConsonantsIfTest {

    public void vowelAlphabet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите букву английского алфавита:");
        char letter = sc.next().toLowerCase().trim().charAt(0);

        if (letter >='a' && letter <='z' ) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y')
                System.out.println(letter + " - гласная буква английского алфавита");
            else
                System.out.println(letter + " - согласная буква английского алфавита");
        } else
            System.out.println(letter + " - не буква английского алфавита");
    }
}