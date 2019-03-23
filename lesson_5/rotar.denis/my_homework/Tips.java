import java.net.SocketImpl;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Tips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Sum;
        int mark;
        System.out.println("Enter your Sum: ");
        Sum = scanner.nextDouble();
        System.out.println("Choose quality of service: ");
        System.out.println(" 1 -terrible");
        System.out.println(" 2 -poor");
        System.out.println(" 3 -good");
        System.out.println(" 4 -great");
        System.out.println(" 5 -excellent");

        mark = scanner.nextInt();
        System.out.println("Tips:  " + calculateTips(Sum, mark));
    }

    private static double calculateTips(double Sum, int mark) {
        double tips=0;
        switch (mark){
            case 1:
                tips =0;
                break;
            case 2:
                tips = Sum*0.05;
                break;
            case 3:
                tips = Sum*0.1;
                break;
            case 4:
                tips = Sum*0.15;
                break;
            case 5:
                tips = Sum*0.2;
                break;
            default:
                tips = Sum*0.2;
        }
        return tips;
    }
}