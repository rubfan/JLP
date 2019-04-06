import java.util.Scanner;

public class ROOT {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number: ");
            int num = sc.nextInt();
            int sum = 0;
            while (true)
                if (num > 0) {
                    int dsum = num % 10;
                    num /= 10;
                    sum += dsum;
                } else if (sum > 9) {
                    int dsum = sum % 10;
                    sum /= 10;
                    sum += dsum;

                } else if (sum <= 9) break;
            System.out.println("Digital root of " + num + " is: " + sum);
        }

    }

