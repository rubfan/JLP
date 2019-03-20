package lesson6;
import java.util.Arrays;

/**
 * 1) Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
 * 2) Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
 * 3) Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
 * 4) Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 * 5) Найти сумму первых n элементов массива
 * 6) Найти минимальный и максимальный элемент массива
 * 7) Найти сумму всех четных и сумму всех нечетных элементов массива
 * 8) Найти все счастливые билеты от 100000 до 999999 :
 * билет счастливый если сумма первых трех цифр равна сумме трех последних
 * например,  123312: 1+2+3==3+1+2
 * 9) Перевести число в двоичную систему счисления
 * 10) Вывести первые 5 минимальных элементов массива
 * 11) Write  a program to repeatedly add all the digits until the result has only one digit of a given non-negative number:
 * The digital root of 555555 = 5 + 5 + 5 + 5 + 5 + 5 = 30 = 3 + 0 = 3
 */
public class Sequences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        findSum(arr, 3);
        findMinMaxArr(arr);
        int n = 555555;
        System.out.println(digroot(n));
    }

    public static void firstSequences() {
        for (int i = 1000; i <= 9999; i += 3) {
            System.out.print(i + " ");
        }
    }

    public static void secondSequences() {
        for (int i = 1, j = 1; i <= 55; i++, j += 2) {
            System.out.print(j + " ");
        }
    }

    public static void thirdSequences() {
        for (int i = 95; i > 0; i -= 5) {
            System.out.print(i + " ");
        }
    }

    public static void fourthSequences() {
        for (int i = 1, j = 2; i <= 20; i++, j *= 2) {
            System.out.print(j + " ");
        }
    }

    public static void findSum(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i <= arr[n - 1]; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void findMinMaxArr(int arr[]) {
        Arrays.sort(arr);
        int minNum = arr[0];
        int maxNum = arr[arr.length - 1];
        System.out.printf("Minimal number of array is %d, maximal number of array %d\n", minNum, maxNum);
    }

    public static void findSumEvenOdd(int arr[]) {
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        for (int el : arr) {
            if (el % 2 == 0) {
                sumEvenNumbers += el;
            } else {
                sumOddNumbers += el;
            }
        }
        System.out.printf("Sum of even numbers of array is %d, sum of odd numbers of array is %d\n", sumEvenNumbers, sumOddNumbers);
    }

    public static void countLuckyTickets() {
        int count = 0;
        for (int ticket = 1; ticket < 1000000; ticket++) {
            if (ticket / 100000 + (ticket / 10000) % 10 + (ticket / 1000) % 10 == (ticket / 100) % 10 + (ticket / 10) % 10 + ticket % 10) {
                count = count + 1;
            }
        }
        System.out.printf("There are %d lucky tickets\n", count);
    }

    public static void convertToBinary(Integer number) {
        String convert = Integer.toBinaryString(number);
        System.out.println(convert);
    }
    public static void getFirstMinNum(int arr[]){
        Arrays.sort(arr);
        System.out.println("First five minimal numbers of array is ");
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int digroot(int n){
        int root = 0;
        while (n > 0 || root > 9)
        {
            if (n == 0) {
                n = root;
                root = 0;
            }
            root += n % 10;
            n /= 10;
        }
        return root;
    }
}



