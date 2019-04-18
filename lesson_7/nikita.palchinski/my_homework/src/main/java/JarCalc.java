public class JarCalc {
    public static void main(String[] args) {

        String firstOperand = args[0];
        String secondOperand = args[1];

        System.out.println(firstOperand + " + " + secondOperand + " = " + (Integer.parseInt(firstOperand) + Integer.parseInt(secondOperand)));

    }
}
