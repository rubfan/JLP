import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String operation = args[0];

        String firstOperand = args[1];
        if(!(operation.equals("abs"))) {
            System.out.println("Enter second operand: ");
            String secondOperand = args[2];

            switch (operation) {
                case "+":
                    System.out.println(firstOperand + " + " + secondOperand + " = " + (Integer.parseInt(firstOperand) + Integer.parseInt(secondOperand)));
                    break;
                case "-":
                    System.out.println(firstOperand + " - " + secondOperand + " = " + (Integer.parseInt(firstOperand) - Integer.parseInt(secondOperand)));
                    break;
                case "*":
                    System.out.println(firstOperand + " * " + secondOperand + " = " + (Integer.parseInt(firstOperand) * Integer.parseInt(secondOperand)));
                    break;
                case "/":
                    System.out.println(firstOperand + " / " + secondOperand + " = " + ((float)Integer.parseInt(firstOperand) / Integer.parseInt(secondOperand)));
                    break;
                case "%":
                    System.out.println(firstOperand + " % " + secondOperand + " = " + (Integer.parseInt(firstOperand) % Integer.parseInt(secondOperand)));
                    break;
                default:
                    System.out.println("Unable operation. Try again.");
                    break;
            }
        }
        else
            System.out.println("|" + firstOperand + "|" + " = " + Math.abs(Integer.parseInt(firstOperand)));

    }
}
