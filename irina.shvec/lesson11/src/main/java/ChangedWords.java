/*i18n используется для обозначения слова internationalization, где 18 означает количество букв
 между первой и последней в этом слове, такое можно встретить в среде разработчиков. Например,
 для слова localization используется сокращение l10n. Напишите функцию, которая преобразует слова
 введенные из консоли через пробел в сокращенную форму. Слова длиной меньше 4х оставить без изменений.*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChangedWords {
    public static void main(String[] args) {
        String scanner = new Scanner(System.in).nextLine();
        for (String el : split(scanner, " ")) {
            changeWord(el);
        }
    }

    public static void changeWord(String a) {
        if (a.length() <= 4) {
            System.out.print(a);
        } else {
            int middle = a.length() - 2;
            char firstLit = a.charAt(0);
            char last = a.charAt(a.length() - 1);
            System.out.printf("%s%d%s ", firstLit, middle, last);
        }
    }

    public static String[] split(String a, String delimiter) {
        int countDelimiter = 0;
        Matcher matcher = Pattern.compile(delimiter).matcher(a);
        while (matcher.find()) {
            countDelimiter++;
        }
        String[] array = new String[countDelimiter+1];

        while ((a.length() != 1 || a.indexOf(delimiter) != 0) && (a.length() != 2) || a.matches(delimiter) == false) {
            a = a.concat(delimiter);
            int i = 0;
            int index = a.indexOf(delimiter);
            for (int j = 0; j < array.length && i < a.length(); j++) {
                array[j] = a.substring(i, index);
                i = index +1;
                index = a.indexOf(delimiter, i);
            }
            break;
        }
        return array;
    }
}

