import java.util.Scanner;

public class Tips {

    public static void main(String[] args) {

        System.out.println("Please rate the quality of service(terrible, poor, good, great, excellent): ");
        Scanner scanner = new Scanner(System.in);
        String quantity = scanner.nextLine();
        System.out.println("Enter amount: ");
        int amount = scanner.nextInt();

        switch (quantity){

            case ("terrible"):
                System.out.println(0);
                break;

            case ("poor"):
                System.out.println(amount*0.05);
                break;

            case ("good"):
                System.out.println(amount*0.1);
                break;

            case ("great"):
                System.out.println(amount*0.15);
                break;

            case ("excellent"):
                System.out.println(amount*0.2);
                break;
        }

    }
}