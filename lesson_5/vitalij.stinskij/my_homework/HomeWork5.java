import java.util.Scanner;

public class HomeWork5 {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        HomeWork5 m = new HomeWork5();
        m.calc();
        m.tip();
    }

    private void calc(){
        System.out.print("Select operation \n 1.addition \n 2.subtraction " +
                "\n 3.multiplication \n 4.division \n ");
        
        int operation = in.nextInt();
        System.out.print("Input first num: ");
        
        int a = in.nextInt();
        System.out.print("Input second num: ");
        
        int b = in.nextInt();
        switch (operation)
        {
            case 1:
                System.out.println("Answer: " + (a + b));
                break;
            case 2:
                System.out.print("Answer: " + (a - b));
                break;
            case 3:
                System.out.println("Answer: " + (a * b));
                break;

            case 4:
                System.out.println("Answer: " + (a / b));
                break;

             default:
                System.out.println("Invalid choose of operation");
        }
    }

   private void tip() {
       System.out.print("Input sum: ");
       int sum = in.nextInt();
        System.out.print("Select level of service: \n 1.terrible " +
                "\n 2.poor \n 3.good \n 4.great \n 5.excellent \n");
        int operation = in.nextInt();

        switch (operation) {
            case 1:
                System.out.println("tip: " + 0);
                break;

            case 2:
                System.out.println("tip: " + (percent(sum,5)));
                break;

            case 3:
                System.out.println("tip: " + (percent(sum,10)));
                break;

            case 4:
                System.out.println("tip: " + (percent(sum,15)));
                break;

            case 5:
                System.out.println("tip: " + (percent(sum,20)));
                break;
            default:
                System.out.println("Invalid choose of operation");
        }
    }

    private int percent(int sum, int per){
          sum = sum*per/100;
        return sum;
    }

}
