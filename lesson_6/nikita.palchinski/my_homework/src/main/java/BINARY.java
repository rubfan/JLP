import java.util.*;

public class BINARY {

    public static void main(String[] args)
        {
            Scanner nput = new Scanner(System.in);
            System.out.println("Enter your number: ");
            int n = nput.nextInt();
            double fl = (double)Math.log((double)n) / (double)Math.log(2);
            int l = (int) fl + 1;
            int[] bin = new int[l];
            for (int i = (l - 1); i >= 0; i--) {
                bin[i] = n % 2;
                n = n / 2;
            }
            for (int o = 0; o < l; o++) {
                System.out.print(bin[o]);
            }
        }
}
