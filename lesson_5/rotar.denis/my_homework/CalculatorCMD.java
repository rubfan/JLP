import java.util.Scanner;
import java.io.*;

public class CalculatorCMD {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter operation:(сложение, вычитание, умножение, деление, нахождение модуля, остаток от деления");
        String operation = scan.nextLine();
        System.out.println("Enter first number:");
        double firstNum = scan.nextDouble();
        System.out.println("Enter second number:");
        double secondNum = scan.nextDouble();

        calculate(operation, firstNum, secondNum);
    }

    private static void calculate(String operation, double firstNum, double secondNum) {
        double result;
        switch (operation){
            case "сложение":
                result = firstNum + secondNum;
                System.out.println(result);
                break;
            case "вычитание":
                result = firstNum - secondNum;
                System.out.println(result);
                break;
            case "умножение":
                result = firstNum * secondNum;
                System.out.println(result);
                break;
            case "деление":
                result = firstNum / secondNum;
                System.out.println(result);
                break;
            case "нахождение модуля":
                System.out.println( Math.abs(firstNum) + " " + Math.abs(secondNum));
                break;
            case "остаток от деления":
                result = firstNum % secondNum;
                System.out.println(result);
                break;
            default:
                System.out.println("Неверная операция!");
        }
    }
}