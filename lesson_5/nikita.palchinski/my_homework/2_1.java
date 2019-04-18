import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int firstOperand = 7;
        int secondOperand = 3;

        String operation = "division";

        switch (operation) {
            case "addition":
                System.out.println(firstOperand + " + " + secondOperand + " = " + (firstOperand + secondOperand));
                break;
            case "subtraction":
                System.out.println(firstOperand + " - " + secondOperand + " = " + (firstOperand - secondOperand));
                break;
            case "multiplication":
                System.out.println(firstOperand + " * " + secondOperand + " = " + (firstOperand * secondOperand));
                break;
            case "division":
                System.out.println(firstOperand + " / " + secondOperand + " = " + ((float)firstOperand / secondOperand));
                break;
            case "remainder":
                System.out.println(firstOperand + " % " + secondOperand + " = " + (firstOperand % secondOperand));
                break;
            case "absloute":
                System.out.println("|" + firstOperand + "|" + " = " + Math.abs(firstOperand));
                break;
            default:
                System.out.println("Unable operation. Try again.");
                break;
        }
    }
}
