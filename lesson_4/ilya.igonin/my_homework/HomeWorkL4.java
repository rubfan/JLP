
import java.util.Scanner;

public class HomeWorkL4 {

    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();


    public static void main(String[] args) {
        HomeWorkL4 hw = new HomeWorkL4();
        hw.ex1();
        hw.ex2();
        hw.ex3();
        hw.ex4();
        hw.ex5();
        hw.ex6();
        hw.ex7();
    }


    private void ex1() {
        int min = Math.min(Math.min(a, b), c);
        System.out.println("Min num: " + min);
    }


    private void ex2() {
        int min = Math.min(Math.min(a, b), c);
        System.out.println("Min num: " + min);
        int max = Math.max(Math.max(a, b), c);
        System.out.println("Max num: " + max);
    }

    private void ex3() {

        if (a == b && b == c) {
            System.out.println("All numbers are equal");
        }
        else if (a > b && b == c) {
            System.out.println("Min numbers: " + b + ", " + c);
        }
        else if (b > a && a == c) {
            System.out.println("Min numbers: " + a + ", " + c);
        }
        else if (c > a && a == b) {
            System.out.println("Min numbers: " + a + ", " + b);
        }
    }


    private void ex4() {

        if ((a % 2) == 0) {
            System.out.println("Число " + a + " четное ");
        }
        else if ((a % 1) == 0) {
            System.out.println("Число " + a + " нечетное ");
        }
    }


    private void ex5() {

        if ((a % b) == 0) {
            System.out.println("Без остатка");
        }
        else if ((a % b) != 0) {
            System.out.println("С остатком");
        }
    }

    private void ex6() {

        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            System.out.println(a + " ближе к 10 чем " + b);
        }
        else if (Math.abs(a - 10) > Math.abs(b - 10)) {
            System.out.println(b + " ближе к 10 чем " + a);
        }
        else if (Math.abs(a - 10) == Math.abs(b - 10)) {
            System.out.println(a + " и " + b + " на одинаковом расстоянии от 10-ти");
        }
    }


    private void ex7() {

        int days = in.nextInt();
        int rentPrice;

        if (days <=5) {
            rentPrice = days * 40;
            System.out.println("Rent price: " + rentPrice);
        }
        else if(days > 5 && days <=7) {
            rentPrice = days * 40 - 20;
            System.out.println("Rent price: " + rentPrice);
        }
        else if(days > 7) {
            rentPrice = days * 40 - 50;
            System.out.println("Rent price: " + rentPrice);
        }
    }
}
