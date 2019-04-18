import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Min: " + f1());
        f2();
        f3();
        f4();
        f5();
        f6();
        f7();
    }

    public static int f1() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        return Math.min(Math.min(a, b), c);
    }

    public static void f2() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Min: " + Math.min(Math.min(a, b), c));
        System.out.println("Max: " + Math.max(Math.max(a, b), c));
    }

    public static void f3() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a <= b && a <= c) {
            System.out.println("Min: " + a);
        }
        if (b <= c && b <= a) {
            System.out.println("Min: " + b);
        }
        if (c <= a && c <= b) {
            System.out.println("Min: " + c);
        }
    }

    public static void f4() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Четное число");
        } else System.out.println("Нечетное число");
    }

    public static void f5() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % b == 0) {
            System.out.println("Без остатка");
        } else System.out.println("С остатком");
    }

    public static void f6() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            System.out.println("Ближайшее число к 10: " + a);
        } else if (a + b == 20) {
            System.out.println("Ближайшее число к 10: " + a + " и " + b);
        } else System.out.println("Ближайшее число к 10: " + b);
    }

    public static void f7() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 5 && a <= 7) {
            System.out.println("Аренда: " + (a * 40 - 20));
        }
        if (a > 7) {
            System.out.println("Аренда: " + (a * 40 - 50));
        }
        if (a < 0) {
            System.out.println("Неправильно введенные данные");
        } else
            System.out.println("Аренда: " + a * 40);
    }
}