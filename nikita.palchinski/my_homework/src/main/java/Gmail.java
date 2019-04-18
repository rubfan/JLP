import java.sql.SQLOutput;
import java.util.Scanner;

public class Gmail {
    public static int checker(String gmail)
    {
        if (gmail.indexOf("@gmail.com") == -1) {
            System.out.println("Your input is wrong,\ntry again: ");
            return 0;
        }
        return 1;
    }

    public static String changer(String gmail)
    {
        gmail = gmail.replace("@", "[at]");
        gmail = gmail.replace(".", "[dot]");
        return gmail;
    }
    public static void main(String args[])
    {
        String gmail = "";
        System.out.println("Enter your Gmail: ");
        Scanner sc = new Scanner(System.in);
        gmail = sc.nextLine();
        while(checker(gmail) == 0)
        {
            gmail = sc.nextLine();
        }
        System.out.print("Return: \n" + changer(gmail));
    }
}
