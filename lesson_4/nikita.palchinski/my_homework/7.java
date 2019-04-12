import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.println("Enter rental price per day: ");
        int price = n.nextInt();
        System.out.println("Enter number of days: ");
        int days = n.nextInt();

        int weeks = (int)(days / 7);
        int total = price * days - weeks * 50 - (days % 7 > 5 ? 1 : 0) * 20;

        System.out.format("Total cost to pay for rent: %s",total);

    }
}
