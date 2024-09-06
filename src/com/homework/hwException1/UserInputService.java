package com.homework.hwException1;

import java.util.ArrayList;
import java.util.List;

class UserInputService {
    private int MAX_SIZE = 5;
    private List<String> userInputs;
    public UserInputService() {
        userInputs = new ArrayList<>();
    }

    public void addInput(String input) throws MemoryOverflowException {
        if (userInputs.size() >= MAX_SIZE) {
            throw new MemoryOverflowException("Память переполнена! Максимальное количество элементов: " + MAX_SIZE);
        }
        userInputs.add(input);
    }

    public String getAndRemoveLastInput() throws EmptyMemoryException {
        if (userInputs.isEmpty()) {
            throw new EmptyMemoryException("Память пуста! Невозможно получить запись.");
        }
        return userInputs.remove(userInputs.size() - 1);
    }

}
