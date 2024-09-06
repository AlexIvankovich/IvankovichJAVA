package com.homework.hwException2;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputService {
    private ArrayList<String> memory;
    public UserInputService() {
        this.memory = new ArrayList<>();
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово (введите 'get' для получения самого старого элемента, 'exit' для завершения):");

        while (true) {
            try {
                String input = scanner.nextLine();
                if ("exit".equalsIgnoreCase(input)) {
                    System.out.println("Выход из программы.");
                    break;
                }

                if ("get".equalsIgnoreCase(input)) {
                    if (memory.isEmpty()) {
                        System.out.println("Память пуста, нет элементов для возврата.");
                    } else {
                        String oldestElement = memory.remove(0);
                        System.out.println("Самый старый элемент: " + oldestElement);
                    }
                } else {
                    memory.add(input);
                    System.out.println("Слово '" + input + "' сохранено в памяти.");
                }
            } catch (Exception e) {
                System.out.println("Произошла ошибка: " + e.getMessage());
            }
        }

    }
    public static void main(String[] args) {
        UserInputService service = new UserInputService();
        service.start();
    }
}

