
public class CalculatorCMD {

    public static void main(String[] args) {
        String operation = args[0];
        double firstNumber = Double.parseDouble(args[1]);
        double secondNumber = Double.parseDouble(args[2]);
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
} }
