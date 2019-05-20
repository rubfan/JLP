import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String input;

        Set<String> answers = new HashSet<>();
        answers.add("a");
        answers.add("m");

        Random rnd = new Random(System.currentTimeMillis());
        System.out.println("Do you want to enter operands and operator manually");
        System.out.println("or do it automatically? (m/a) ");
        Scanner inn = new Scanner(System.in);
        do
            input = inn.nextLine();
        while(!answers.contains(input));
        switch (input) {
            case "a":
                {
                int firstOperand = -8000 + rnd.nextInt(16001);
                int secondOperand = -8000 + rnd.nextInt(16001);

                String operations[] = {"addition", "subtraction", "multiplication", "division", "remainder", "absolute"};
                int idx = rnd.nextInt(6);
                String operation = operations[idx];

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
                        System.out.println(firstOperand + " / " + secondOperand + " = " + ((float) firstOperand / secondOperand));
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
                break;


            case "m":
                Scanner man = new Scanner(System.in);
                System.out.println("Enter operation:(+, -, *, /, %, abs) ");
                String operation = man.nextLine();
                System.out.println("Enter first operand: ");
                int firstOperand = man.nextInt();
                if(!(operation.equals("abs"))) {
                    System.out.println("Enter second operand: ");
                    int secondOperand = man.nextInt();

                    {
                        switch (operation) {
                            case "+":
                                System.out.println(firstOperand + " + " + secondOperand + " = " + (firstOperand + secondOperand));
                                break;
                            case "-":
                                System.out.println(firstOperand + " - " + secondOperand + " = " + (firstOperand - secondOperand));
                                break;
                            case "*":
                                System.out.println(firstOperand + " * " + secondOperand + " = " + (firstOperand * secondOperand));
                                break;
                            case "/":
                                System.out.println(firstOperand + " / " + secondOperand + " = " + ((float) firstOperand / secondOperand));
                                break;
                            case "%":
                                System.out.println(firstOperand + " % " + secondOperand + " = " + (firstOperand % secondOperand));
                                break;
                            default:
                                System.out.println("Unable operation. Try again.");
                                break;
                        }


                    }
                }
                else
                    System.out.println("|" + firstOperand + "|" + " = " + Math.abs(firstOperand));


        }
    }
}
