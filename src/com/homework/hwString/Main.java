package com.homework.hwString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите русский текст:");
        String text = scanner.nextLine();

        PalindromeAnalyzer textAnalyzer = new PalindromeAnalyzer(text);
        textAnalyzer.analyzeText();
    }
}
