import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();

        m.nearestNumber();
    }

    private void nearestNumber(){

            int num = 10;

            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int c = Math.abs(num - a);
            int d = Math.abs(num - b);

            if(c > d){
                System.out.println("The nearest number: " + b);
            }
            if(c < d) {
                System.out.println("The nearest number: " + a);
            }
            if(c == d){
                System.out.println("The numbers are equidistant.");
            }
        }
}
