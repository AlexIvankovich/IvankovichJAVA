package com.homework.hw1;

import java.util.Scanner;

public class InputWordBeforeExit {

    public void wordBeforeExit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово для вывода в консоль, если введёте exit - произойдет выход из программы");
        String word;

        while (true) {
            word = sc.next().toLowerCase().trim();
            if (word.equals("exit")) {
                System.out.println("Выполнен выход");
                break;
            } else {
                System.out.println("Вы ввели - " + word);
                System.out.println("Введите слово для вывода в консоль, если введёте exit - произойдет выход из программы");
            }
        }
    }
}