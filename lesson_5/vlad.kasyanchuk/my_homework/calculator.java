package com.company;

public class Main {

    public static void main(String[] args) {

        int firstOperand = -15;
        int secondOperand = 12;
        double firstOperandD = (double) firstOperand;
        double secondOperandD = (double) secondOperand;

        String operation = "absolute";

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
