package com.homework.hwString;

import java.util.HashMap;
import java.util.Map;

class PalindromeAnalyzer {
    private String text;

    public PalindromeAnalyzer(String text) {
        this.text = text;
    }

    public void analyzeText() {
        countWords();
        findLongestWord();
        countLetterFrequency();
        reverseWords();
        checkPalindrome();
    }

    private void countWords() {
        String[] words = text.split("\\s+");
        System.out.println("Общее количество слов: " + words.length);
    }

    private void findLongestWord() {
        String[] words = text.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Самое длинное слово: " + longestWord);
    }

    private void countLetterFrequency() {
        Map<Character, Integer> letterCount = new HashMap<>();
        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println("Частота каждой буквы:");
        for (char c = 'а'; c <= 'я'; c++) {
            if (letterCount.containsKey(c)) {
                System.out.println(c + ": " + letterCount.get(c));
            }
        }
    }

    private void reverseWords() {
        StringBuilder reversedWords = new StringBuilder();
        String[] words = text.split("\\s+");

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedWords.append(reversedWord).append(" ");
        }
        System.out.println("Слова задом наперед: " + reversedWords.toString().trim());
    }

    private void checkPalindrome() {
        String cleanedText = text.replaceAll("[^а-яА-ЯёЁ]", "").toLowerCase();
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        if (cleanedText.equals(reversedText)) {
            System.out.println("Текст является палиндромом.");
        } else {
            System.out.println("Текст не является палиндромом.");
        }
    }
}