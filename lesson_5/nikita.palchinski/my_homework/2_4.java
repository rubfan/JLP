import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String input;

        Map<String, Double> answers = new HashMap<String, Double>();
        answers.put("t", 0.0);
        answers.put("p", 0.05);
        answers.put("gd", 0.1);
        answers.put("gr", 0.15);
        answers.put("exc", 0.2);

        Scanner inn = new Scanner(System.in);

        System.out.println("Enter the the price you have to pay: ");
        int price = inn.nextInt();
        System.out.println("What is the level of service in our cafe? (t/p/gd/gr/exc) ");
        System.out.println("t - terrible");
        System.out.println("p - poor");
        System.out.println("gd - good");
        System.out.println("gr - great");
        System.out.println("exc - excellent");
        do
            input = inn.nextLine();
        while(!answers.containsKey(input));

        System.out.println("Tips that you should give to the waiter: " + (price * answers.get(input)));

    }
}
