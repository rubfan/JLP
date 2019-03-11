import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите операцию:");
        String operation = sc.nextLine();
        if(operation.equals("abs")){
            System.out.println("Введите  число:");
            int a = sc.nextInt();
            System.out.println(Math.abs(a));}
        else {
            System.out.println("Введите первое число:");
            int firstOperand = sc.nextInt();
            System.out.println("Введите второе число:");
            int secondOperand = sc.nextInt();
            if (operation.equals("addition")) {
                System.out.println(firstOperand + secondOperand);
            }
            if (operation.equals("multiplication")) {
                System.out.println(firstOperand * secondOperand);
            }
            if (operation.equals("subtraction")) {
                System.out.println(firstOperand - secondOperand);
            }
            if (operation.equals("division")) {
                System.out.println(firstOperand / secondOperand);
            }
            if (operation.equals("remainder")) {
                System.out.println(firstOperand % secondOperand);
            }
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму:");
        int bill = sc.nextInt();
        System.out.println("Введите уровень обслуживания:");
        String service = sc.next();
        if (service.equals("terrible")) System.out.println(bill+bill*0);
        if (service.equals("poor")) System.out.println(bill+bill*0.05);
        if (service.equals("good")) System.out.println(bill+bill*0.1);
        if (service.equals("great")) System.out.println(bill+bill*0.15);
        if (service.equals("excellent")) System.out.println(bill+bill*0.2);


    }
}
