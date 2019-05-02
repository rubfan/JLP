import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double  a, b;
        String operation;

        System.out.println("Input operation: ");
        operation = sc.nextLine();
        System.out.println("Input first number: ");
        a = sc.nextInt();
        System.out.println("Input second number: ");
        b = sc.nextInt();
        System.out.println("Result: ");
        calc(operation, a, b);
    }

    private static void calc(String operation, double firstNum, double secondNum) {
        double result;
        switch (operation){

            case "+":
                result = firstNum + secondNum;
                System.out.println(result);
                break;

            case "-":
                result = firstNum - secondNum;
                System.out.println(result);
                break;

            case "*":
                result = firstNum * secondNum;
                System.out.println(result);
                break;

            case "/":
                result = firstNum / secondNum;
                System.out.println(result);
                break;

            case "%":
                result = firstNum % secondNum;
                System.out.println(result);
                break;

            case "||":
                System.out.println( Math.abs(firstNum) + " " + Math.abs(secondNum));
                break;

            default:
                System.out.println("Неверная операция!");
        }
    }
} 