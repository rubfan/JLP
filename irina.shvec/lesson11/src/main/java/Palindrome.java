/*
Определить является ли слово палиндромом, т.е. читается одинаково, слева направо и справа налево.
Определить количество таких слов в тексте, в котором все слова введены через запятую.
        Пример ввода:
        deleveled, evitative, cat, dog, deified
        Результат:
        There are 3 palindromes in the text
PS: используйте метод split c параметром "," и потом метод trim, чтобы удалить лишние пробелы слева и справа
*/

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String scanner = new Scanner(System.in).nextLine();
        int countPalindrome = 0;
        for (String el : ChangedWords.split(scanner, ",")) {
            if (isPalindrome(el.trim())) {
                countPalindrome++;
            }
        }
        System.out.printf("There are %d palindromes in the text", countPalindrome);
    }

    public static boolean isPalindrome(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(reverse);
    }
}
