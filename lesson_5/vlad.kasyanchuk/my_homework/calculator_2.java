package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // int firstOperand = -15;
        // int secondOperand = 12;
        // String operation = "absolute";
        System.out.println("Please enter one of the following operation: multipliation, division, addition, subtraction, rest, absolute:");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        System.out.println("Please enter first number:");
        int firstOperand = scanner.nextInt();
        System.out.println("Please enter second number:");
        int secondOperand = scanner.nextInt();

        double firstOperandD = (double) firstOperand;
        double secondOperandD = (double) secondOperand;

       // multipliation, division, addition, subtraction, rest, absolute

        switch (operation){
            case ("multipliation"):
                System.out.println(firstOperand*secondOperand);
                break;
            case ("division"):
                System.out.println( firstOperandD / secondOperandD);
                break;
            case ("addition"):
                System.out.println(firstOperand+secondOperand);
                break;
            case ("subtraction"):
                System.out.println(firstOperand-secondOperand);
                break;
            case ("rest"):
                System.out.println(firstOperand%secondOperand);
                break;
            case ("absolute"):
                System.out.println(Math.abs(firstOperand));

        }

    }
}
