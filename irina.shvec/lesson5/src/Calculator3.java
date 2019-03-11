import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(("Enter the operation:"));
        char[] operation = br.readLine().toCharArray();

        System.out.println("Enter the number:");
        int num1 = Integer.parseInt(br.readLine());
        System.out.println("Enter the number:");
        int num2 = Integer.parseInt(br.readLine());
        int result = calc(num1, num2, operation);
        System.out.println("Result of operation: " + result);
    }

    public static int calc(int firstOperand, int secondOperand, char[] operation) {
        int result = 0;
        switch (operation[0]) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                result = firstOperand / secondOperand;
                break;
            case '%':
                result = firstOperand % secondOperand;
                break;
            case '|':
                result = Math.abs(firstOperand);
                break;
            default:
                System.out.println("Operation isn't recognized. Please, re-enter");
        }
        return result;
    }
}


