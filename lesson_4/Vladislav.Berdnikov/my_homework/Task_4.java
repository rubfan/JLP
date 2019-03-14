import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();

        m.evenOddNumber();
    }

    private void evenOddNumber(){

            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();

            if(a % 2 == 0){
                System.out.println("The number is even");
            }
            else {
                System.out.println("The number is odd.");
            }
        }
}
