public class SmallCalculator {

    public static void main(String[] args) {
     int first = Integer.parseInt(args[0]);
     int second = Integer.parseInt(args[1]);

        System.out.println(sumTwoNumbers(first, second));

    }

    private static int sumTwoNumbers(int first, int second) {
        return  first+second;
    }
}
