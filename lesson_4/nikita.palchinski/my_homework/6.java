import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();

        if(a == b)
            System.out.println("Both are equidistant from 10.");
        else
            System.out.format(Math.abs(10 - a) < Math.abs(10 - b) ? "Number %1$s is closer to 10 than %2$s." : "Number %2$s closer to 10 than %1$s.", a, b);

    }
}


