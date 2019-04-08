import java.util.Random;

public class Task11 {

    //11) Write a program to repeatedly add all the digits until the result has only
    // one digit of a given non-negative number:
    // The digital root of 555555 = 5 + 5 + 5 + 5 + 5 + 5 = 30 = 3 + 0 = 3

    public static void main(String[] args) {
        Random rand = new Random();

        int num = rand.nextInt(Integer.MAX_VALUE);
        int pow = 10;
        int sum = 0;

        int i = num;
        System.out.println("Number :\t" + num);
        do {
            sum = 0;
            while (i > 0) {
                if (i % pow > 9) {
                    pow *= 10;
                } else {
                    sum += (i % pow);
                    i /= 10;
                    pow = 10;
                }
            }
            System.out.println("Next sum:\t" + sum);
            i = sum;
        } while (sum > 9);

        System.out.println("Digital root:\t" + sum);
    }
}
