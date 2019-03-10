import java.io.Console;

public class Calculator3 {
   static Console console = System.console();

    public static void main(String[] args) {
        if(console!=null) {
            char[] operation = console.readPassword("Enter the operation:");
            String num1 = console.readLine("Enter the number:");
            String num2 = console.readLine("Enter the number:");
            int result = calc(num1, num2, operation);
            System.out.println("Result of operation: " + result);
        }
    }
    public static int calc(String firstOperand, String secondOperand, char [] operation){
        int result = 0;
        switch (operation[0]){
            case '+':
                result = Integer.parseInt(firstOperand)+Integer.parseInt(secondOperand);
                break;
            case '-':
                result = Integer.parseInt(firstOperand)-Integer.parseInt(secondOperand);
                break;
            case '*':
                result = Integer.parseInt(firstOperand)*Integer.parseInt(secondOperand);
                break;
            case '/':
                result = Integer.parseInt(firstOperand)/Integer.parseInt(secondOperand);
                break;
            case '%':
                result = Integer.parseInt(firstOperand)%Integer.parseInt(secondOperand);
                break;
            case '|':
                result = Math.abs(Integer.parseInt(firstOperand));
                break;
            default:
                System.out.println("Operation isn't recognized. Please, re-enter");
        }
        return result;
    }
}


