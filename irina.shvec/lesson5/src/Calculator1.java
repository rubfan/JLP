public class Calculator1 {
    public static void main(String[] args) {
        int result = calc(15,12,'%');
        System.out.println("Result of operation: "+ result);
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
}
