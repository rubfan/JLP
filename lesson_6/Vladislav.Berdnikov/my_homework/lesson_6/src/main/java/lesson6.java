import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lesson6 {

    public static void main(String[] args){
        
        sequenceOfNumbers();
        secondSequenceOfNumbers();
        thirdSequenceOfNumbers();
        forthSequenceOfNumbers();
        arraySum();
        arrayMinAndMax();
        sumEvenAndOdd();
        binaryConvert(15);
        arrMin();
        sumOfNumbers();

    }

    static void sequenceOfNumbers() {

        System.out.println("Sequence from 1000: ");

        for (int i = 1000; i < 10000; i += 3) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
    }

    static void secondSequenceOfNumbers() {
        System.out.println("Sequence of first 55 elements: ");
        for (int i = 1; i < 111; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    static void thirdSequenceOfNumbers() {

        System.out.println("Sequence from 90: ");

        for (int i = 90; i >= 0; i -= 5) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
    }

    static void forthSequenceOfNumbers() {

        System.out.println("First 20 elements: ");

        int a = 2;

        for (int i = 1; i <= 20; i++, a *= 2) {
            System.out.print(a + " ");
        }

        System.out.println("\n");
    }

    static void arraySum() {

        Random a = new Random();
        int[] arr = new int[10];
        int n = 3;
        int sum = 0;

        System.out.println("Array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.nextInt(50);
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Array sum: " + sum + "\n");
    }

    static void arrayMinAndMax() {

        System.out.println("Min anв max value of the array: ");
        Random a = new Random();
        int[] arr = new int[10];
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.nextInt(50);
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("\n" + "Min: " + min);
        System.out.println("Max: " + max + "\n");
    }

    static void sumEvenAndOdd() {

        Random a = new Random();
        int[] arr = new int[10];
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.nextInt(50);
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            }
            if (arr[i] % 2 != 0) {
                oddSum += arr[i];
            }
        }

        System.out.println("\n" + "Sum of even elements: " + evenSum + "\n" + "Sum of odd elements: " + oddSum + "\n");
    }

    static void binaryConvert(Integer number) {

        String con = Integer.toBinaryString(number);
        System.out.println("Number in binary: " + con + "\n");
    }

    static void arrMin() {

        System.out.println("Array: ");

        Random a = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.nextInt(50);
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);
        System.out.println("\n" + "First 5 min elements of array: ");

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");
    }

    static void sumOfNumbers(){

        System.out.println("Input number: ");
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        while (i >= 10) {
            int sum = 0;

            for(; i != 0; i /= 10) {
                sum += i % 10;
            }

            i = sum;
        }

        System.out.println("Sum of numbers: " + i);
    }
}