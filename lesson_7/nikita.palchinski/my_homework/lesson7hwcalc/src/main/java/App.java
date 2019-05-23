import java.util.Scanner;
import java.lang.String;

public class App {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first argument: ");
        int a = sc.nextInt();
        System.out.println("Enter second argument: ");
        int b = sc.nextInt();
        System.out.println("Enter the operation: ");
        String operation = sc.next();

        System.out.print("The result: ");
        switch (operation) {
            case "+":
                System.out.println(Calc.add(a, b));
                break;
            case "-":
                System.out.println(Calc.sub(a, b));
                break;
            case "*":
                System.out.println(Calc.mul(a, b));
                break;
            case "/":
                System.out.println(Calc.div(a, b));
                break;
            default:
                System.out.println("Unable operation. Try again.");
                break;
        }
    }
}
