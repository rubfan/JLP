import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();

        m.minValue();
    }

    private void minValue(){

            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int min = Math.min(a, Math.min(b, c));

        System.out.println("Min value: " + min);
        }
}
