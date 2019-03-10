import java.util.Arrays;
import java.util.Scanner;

//3) Тот же калькулятор, только операция и числа вводятся как параметры из командной строки в "Edit Configuration".
// (попробуйте после того как запустили в IDE запустить приложение из консоли с передачей параметров).

public class Calc3 {
    public static void main(String[] args) {

        if(args.length==0){
            System.out.println("The program must take arguments!!!");
            System.out.println("Please restart progam with params:(a-addition/s-substraction/d-division/m-multiplication/%-remainder/abs-absolute value) firstOperand secondOperand");
            System.out.println("Example:");
            System.out.println("java Calc3 a 2 3");
            System.out.println("java Calc3 abs -5");
            return;
        }
        String operation = args[0];

        if (operation.equals("abs")){
            int operand=Integer.parseInt(args[1]);
            System.out.println("ABS("+operand+")="+Math.abs(operand));
        }
        else {
            double firstOp;
            double secondOp;
            double res;

            firstOp=Double.parseDouble(args[1]);
            secondOp=Double.parseDouble(args[2]);

            switch (operation) {
                case "a":
                    res=firstOp+secondOp;
                    System.out.printf("%.1f + %.1f = %.1f\n",firstOp,secondOp,res);
                    break;
                case "s":
                    res=firstOp-secondOp;
                    System.out.printf("%.1f - %.1f = %.1f\n",firstOp,secondOp,res);
                    break;
                case "d":
                    res=firstOp/secondOp;
                    System.out.printf("%.2f / %.2f = %.2f\n",firstOp,secondOp,res);
                    break;
                case "m":
                    res=firstOp*secondOp;
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
