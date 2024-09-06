package com.homework.hwException1;

public class Main {
    public static void main(String[] args) {
        UserInputService userInputService = new UserInputService();
        try {
            userInputService.addInput("Первый ввод");
            userInputService.addInput("Второй ввод");
            userInputService.addInput("Третий ввод");
            userInputService.addInput("Четвертый ввод");
            userInputService.addInput("Пятый ввод");
            userInputService.addInput("Шестой ввод");
        } catch (MemoryOverflowException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(userInputService.getAndRemoveLastInput());
            System.out.println(userInputService.getAndRemoveLastInput());
            System.out.println(userInputService.getAndRemoveLastInput());
            System.out.println(userInputService.getAndRemoveLastInput());
            System.out.println(userInputService.getAndRemoveLastInput());
            System.out.println(userInputService.getAndRemoveLastInput());
        } catch (EmptyMemoryException e) {
            System.out.println(e.getMessage());
        }
    }
}
