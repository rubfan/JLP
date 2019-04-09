import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();

        m.division();
    }

    private void division(){

            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if(a % b == 0){
                System.out.println("The number is divided without remainder");
            }
            else {
                System.out.println("The number is divided with the remainder");
            }
        }
}
