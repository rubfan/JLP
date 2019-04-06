import java.net.SocketImpl;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Tips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double check;
        int quality;

        System.out.println("Enter your check: ");
        check = scanner.nextDouble();
        System.out.println("Choose quality of service: ");
        System.out.println(" 1 -terrible");
        System.out.println(" 2 -poor");
        System.out.println(" 3 -good");
        System.out.println(" 4 -great");
        System.out.println(" 5 -excellent");

        quality = scanner.nextInt();
        System.out.println("Tips:  " + calculateTips(check, quality));



    }

    private static double calculateTips(double check, int quality) {
        double tips=0;

        switch (quality){
            case 1: tips =0;
                 break;
            case 2: tips = check*0.05;
                 break;
            case 3: tips = check*0.1;
                break;
            case 4: tips = check*0.15;
                break;
            case 5: tips = check*0.2;
                break;


        }

        return tips;
    }
}
