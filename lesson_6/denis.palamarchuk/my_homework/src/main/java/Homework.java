import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task10();
        Task11();

    }

    static void Task1() {
        System.out.println("Task1: ");
        for (int i = 1000; i < 10000; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void Task2() {
        System.out.println("Task2: ");
        for (int i = 1; i < 56; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void Task3() {
        System.out.println("Task3: ");
        for (int i = 90; i >= 0; i -= 5) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void Task4() {
        System.out.println("Task4: ");
        int a = 2;
        for (int i = 1; i <= 20; i++, a *= 2) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    static void Task5() {
        Random rn = new Random();
        int[] arr = new int[20];
        int n = 5;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(20);
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Task5: "+sum);
    }

    static void Task6() {
        System.out.println("Task6: ");
        Random rn = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(20);
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    static void Task7() {
        Random rn = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(20);
        }
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            }
            if (arr[i] % 2 != 0) {
                oddSum += arr[i];
            }
        }
        System.out.println("Task7: "+"evenSum: " + evenSum + " " + "oddSum: " + oddSum);
    }

    static void Task8() {
        System.out.println("Task8: ");
        int sum = 0;
        for (int i = 100000; i < 1000000; i++) {
            int num1 = i / 100000;
            int num2 = (i / 10000) % 10;
            int num3 = (i / 1000) % 10;
            int num4 = (i / 100) % 10;
            int num5 = (i / 10) % 10;
            int num6 = i % 10;

            if (num1 + num2 + num3 == num4 + num5 + num6) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static void Task9() {
    }

    static void Task10() {
        System.out.println("Task10: ");
        Random rn = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(20);
        }
        Arrays.sort(arr);
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void Task11(){
        System.out.println("Task11: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while (a >= 10) {
            int sum=0;
            for(;a!=0;a/=10) {
                sum +=a%10;
            }
            a = sum;
        }
        System.out.println(a);
    }
}
