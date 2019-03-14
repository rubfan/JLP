import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();

        m.rentFlat();
    }

    private void rentFlat(){

            int mon = 40;
            int sum;

            Scanner scanner = new Scanner(System.in);

            int days = scanner.nextInt();

            if(5 < days && days < 7){
                sum = (mon * days) - 20;
                System.out.println("Total amount: " + sum);
            }
            if(days > 7) {
                sum = (mon * days) - 50;
                System.out.println("Total amount: " + sum);
            }
            if(days < 5){
                sum = mon * days;
                System.out.println("Total amount: " + sum);
            }
        }
}
