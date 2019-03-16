import java.util.Scanner;


//1) Создайте калькулятор, который выполняет, базовые арифметические операции:
//        - умножение;
//        - деление;
//        - сложение;
//        - вычитание;
//        - остаток от деления (%);
//        - нахождение модуля числа (можно использовать Math.abs)
//        входные данные здесь можно представить как:
//        String operation = "addition";
//        int firstOperand = 15;
//        int secondOperand = 12;
//        2) Добавить к калькулятору возможность ввода операции и чисел из консоли. В начале выводите сообщение "Введите операцию:",
//        дальше пользователь вводит операцию, далее "Введите первое число:" - вводит, "Введите второе число: " - пользователь вводит.

public class Calc1_2 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Input operation (a-addition/s-substraction/d-division/m-multiplication/%-remainder/abs-absolute value):");
        String operation = sc.nextLine();


        if (operation.equals("abs")){
            System.out.println("Input number:");
            int operand = sc.nextInt();
            System.out.println("ABS("+operand+")="+Math.abs(operand));
        }
        else {
            double firstOp;
            double secondOp;
            double res;

            System.out.println("Input first operand:");
            if (sc.hasNextDouble()) {
                firstOp = sc.nextDouble();
            }
            else {
                System.out.println("format not supported");
                return;
            }

            System.out.println("Input second operand:");
            if (sc.hasNextDouble()) {
                secondOp = sc.nextDouble();
            }
            else {
                System.out.println("format not supported");
                return;
            }

            switch (operation) {
                case "a":
                    res = firstOp+secondOp;
                    System.out.printf("%.1f + %.1f = %.1f\n",firstOp,secondOp,res);
                    break;
                case "s":
                    res = firstOp-secondOp;
                    System.out.printf("%.1f - %.1f = %.1f\n",firstOp,secondOp,res);
                    break;
                case "d":
                    res = firstOp/secondOp;
                    System.out.printf("%.2f / %.2f = %.2f\n",firstOp,secondOp,res);
                    break;
                case "m":
                    res = firstOp*secondOp;
                    System.out.printf("%.1f * %.1f = %.1f\n",firstOp,secondOp,res);
                    break;
                case "%":
                    res = firstOp % secondOp;
                    System.out.printf("%.1f %s %.1f = %.1f \n", firstOp,"%", secondOp, res);
                    break;
                default:
                    System.out.println("Unknown operation");
            }

        }


    }
}
