import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Task_1 " + getMin(a, b, c));
        System.out.println("Task_2 " + getMax(a, b, c));
        get3Min(a, b, c);
        System.out.println("Task_4 " + getEvenNumber(a));
        System.out.println("Task_5 " + getEvenNumberfromAtoB(a,b));
        System.out.println("Task_6 " + closesToTen(a, b));
        System.out.println("Task_7 " + getFlatRent(a));
    }

    private static int getMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    private static int getMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    private static void get3Min(int a, int b, int c) {
        if (a < b & a < c) {
            System.out.println("Task_3 " + a);
        } else if (b < a & b < c) {
            System.out.println(b);
        } else System.out.println("Task_3 " + c);
    }

    private static boolean getEvenNumber(int a) {
        return (a % 2 == 0);
    }

    private static boolean getEvenNumberfromAtoB(int a, int b) {
        return (a % b == 0);
    }

    private static int closesToTen(int a, int b) {
        if (Math.abs(a - 10) < (Math.abs(b - 10)))
            return a;
        else
            return b;
    }

    private static int getFlatRent(int a) {
        if (a < 5) {
            return a * 40;
        } else if (a > 5 & a < 7) {
            return a * 40 - 20;}
         else
             return (a * 40) - 50;
        }

    }


