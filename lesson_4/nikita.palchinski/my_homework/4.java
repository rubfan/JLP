import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int a = n.nextInt();

        System.out.format(a % 2 == 0 ? "Number %s is even.": "Number %s is odd.",a, a);

    }
}
