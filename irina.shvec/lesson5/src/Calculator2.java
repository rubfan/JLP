import java.util.Scanner;

public class Calculator2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Result of operation: "+result);
    }
    public static int calc(int firstOperand, int secondOperand, char operation){
        int result = 0;
        switch (operation){
            case '+':
                result = firstOperand+secondOperand;
                break;
            case '-':
                result = firstOperand-secondOperand;
                break;
            case '*':
                result = firstOperand*secondOperand;
                break;
            case '/':
                result = firstOperand/secondOperand;
                break;
            case '%':
                result = firstOperand%secondOperand;
                break;
            case '|':
                result = Math.abs(firstOperand);
                break;
            default:
                System.out.println("Operation isn't recognized. Please, re-enter");
        }
        return result;
    }
    public static int getInt() {
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        return num;
    }
    public static char getOperation(){
        System.out.println("Enter the operation:");
        char operation = scanner.next().charAt(0);
        return operation;
    }
}
