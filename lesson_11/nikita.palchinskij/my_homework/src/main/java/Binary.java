import java.util.*;
public class Binary {

    static String binary = "";
    public static void bin(int n)
    {
        if (n >= 2)
            bin(n / 2);
        System.out.print(n % 2);
        binary = binary.concat(String.valueOf(n % 2));
    }

    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter the n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Binary form is: ");
        bin(n);
        System.out.println();
        System.out.println("Binary value: (as variable)");
        System.out.println(binary);
    }
}