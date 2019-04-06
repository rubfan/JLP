import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();

        int temp = Math.min(a, Math.min(b, c));

        if(b == c && c == a) {
            System.out.println("All the numbers are equal.");
            return;
        }
        if ((temp == a && temp == b) || (temp == c && temp == b) || (temp == c && temp == a))
            System.out.format("Two numbers have minimum value: %s", temp);
        else
            System.out.println(temp);

    }
}
