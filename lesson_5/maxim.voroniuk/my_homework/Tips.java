
//4) Задача "Чаевые".
//        входные данные: сумма, которую вы должны заплатить и уровень сервиса
//        в зависимости от уровня сервиса посчитайте количество денег, которое вы должны оставить:
//        - terrible (0%)
//        - poor (5%)
//        - good (10%)
//        - great (15%)
//        - excellent (20%)
//        Collapse

import java.util.Scanner;

public class Tips {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("Input bill amount:");
        int amount = sc.nextInt();

        System.out.println("Input the level of service(terrible/poor/good/great/excellent):");
        String serviceLevel=sc.next();

        double tipsP = 1;
        switch (serviceLevel){
            case "terrible":
                tipsP = 1;
                break;
            case "poor":
                tipsP = 1.05;
                break;
            case "good":
                tipsP = 1.10;
                break;
            case "great":
                tipsP = 1.15;
                break;
            case "excellent":
                tipsP = 1.20;
                break;
            default:
                tipsP = 0;
                System.out.println("I don't understand you");
        }

        System.out.printf("Total bill amount including tips: %.2f\n",(amount*tipsP));


    }
}
