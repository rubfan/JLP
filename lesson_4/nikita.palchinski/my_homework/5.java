import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();

        if(a < b)
            System.out.format("%s is less than %s.", a, b);
        else
            System.out.format(a % b == 0 ? "Number %s is divided by %s without reminder.": "Number %s is divided by %s with reminder.",a, b);
    }
}
