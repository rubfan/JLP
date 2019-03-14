import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double  firstNumber, secondNumber;
        String operation;

        System.out.println("Введите операцию:");
        System.out.println("(сложение/вычитание/умножение/деление/остаток от деления/нахождение модуля)");
        operation = sc.nextLine();
        System.out.println("Введите первое число:");
        firstNumber = sc.nextInt();
        System.out.println("Введите второе число:");
        secondNumber= sc.nextInt();

        System.out.println("Результат: ");

        calculate(operation, firstNumber, secondNumber);

    }

    private static void calculate(String operation, double firstNumber, double secondNumber) {
        double result;
        switch (operation){
        case "сложение":  result = firstNumber + secondNumber;
            System.out.println(result);
            break;

            case "вычитание": result = firstNumber - secondNumber;
                System.out.println(result);
                break;

            case "умножение": result = firstNumber * secondNumber;
                System.out.println(result);
                break;

            case "деление": result = firstNumber / secondNumber;
                System.out.println(result);
                break;
            case "нахождение модуля":
                System.out.println( Math.abs(firstNumber) + " " + Math.abs(secondNumber));
                break;

            case "остаток от деления": result = firstNumber % secondNumber;
                System.out.println(result);
                break;

                default:
                    System.out.println("Неверная операция!");




        }
    }
}
