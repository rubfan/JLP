/*Напишите программу, которая заменяет символы в почтовом адресе пользователя:
@ заменяется на [ at ]
. заменяется на [ dot ]*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        System.out.println("Please, enter your email address");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        changeSymbol(email);
    }

    public static void changeSymbol(String email) {
        Pattern pattern = Pattern.compile("[@.]");
        Matcher matcher = pattern.matcher(email);
        while (matcher.find()) {
            email = email.replace("@", "[at]");
            email = email.replace(".", "[dot]");
        }
        System.out.println(email);
    }
}
