public class CalculatorCMD {

    public static void main(String[] args) {
        String operation = args[0];
        double firstNum = Double.parseDouble(args[1]);
        double secondNum = Double.parseDouble(args[2]);
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