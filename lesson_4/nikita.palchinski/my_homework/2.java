import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();

        System.out.print("Minimum: ");
       	System.out.println(Math.min(a, Math.min(b, c)));
	System.out.print("Maximum: ");
	System.out.println(Math.max(a, Math.max(b, c)));
    }
}

