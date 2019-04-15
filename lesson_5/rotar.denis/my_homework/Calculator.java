import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  firstNum, secondNum;
        String operation;

        System.out.println("Введите операцию:");
        System.out.println("(сложение/вычитание/умножение/деление/остаток от деления/нахождение модуля)");
        operation = sc.nextLine();
        System.out.println("Введите первое число:");
        firstNum = sc.nextInt();
        System.out.println("Введите второе число:");
        secondNum = sc.nextInt();
        System.out.println("Результат: ");
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