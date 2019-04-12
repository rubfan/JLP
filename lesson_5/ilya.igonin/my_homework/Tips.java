import java.util.Scanner;

public class Tips {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Enter price: ");
        double price = sn.nextDouble();
        System.out.println("Enter service level(terrible, poor, good, great, excellent): ");
        String serviceLvl = sn.next();

        if (serviceLvl.equals("terrible") ) {
            double tip = price * 0;
            System.out.println("Tips: " + tip);
        } else if (serviceLvl.equals("poor")) {
            double tip = price * 0.05;
            System.out.println("Tips: " + tip);
        } else if (serviceLvl.equals("good")) {
            double tip = price * 0.1;
            System.out.println("Tips: " + tip);
        } else if (serviceLvl.equals("great")) {
            double tip = price * 0.15;
            System.out.println("Tips: " + tip);
        } else if (serviceLvl.equals("excellent")) {
            double tip = price * 0.2;
            System.out.println("Tips: " + tip);
        } else {
            System.out.println("Please enter terrible/poor/good/great/excellent");
        }
    }
}
