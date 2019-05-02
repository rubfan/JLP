import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size, countOfElements, numberForBinary;

         Sequence seq = new Sequence();
         System.out.println("The sequence1:");
         seq.show4NumberSequence();
         System.out.println("The sequence2:");
         seq.showUnpairSequence();
         System.out.println("The sequence3:");
         seq.showPositiveSequence();
         System.out.println("The sequence4:");
         seq.showPowSequence();

         System.out.println("Enter size of array:");
         size = scanner.nextInt();
        System.out.println("Enter count of elements:");
        countOfElements = scanner.nextInt();
        Array array = new Array();
        System.out.println("Summa:" + array.summaOfEl(size, countOfElements));
        System.out.println("Minimum and maximum:");
        array.findMaxAndMin(size);
        System.out.println("Summa of pair numbers:");
        array.sumOfPair(size);
        System.out.println("Five minimum numbers:");
        array.getFiveMinimum();
        System.out.println("Converting number to Binary:");
        Number num = new Number();
        numberForBinary= scanner.nextInt();
        num.NumberToBinary(numberForBinary);
        System.out.println("Happy tickets:");
        HappyTicket hp = new HappyTicket();
        hp.findHappyTicket();



    }
}
