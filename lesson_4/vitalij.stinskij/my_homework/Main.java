package com.company;

import java.util.Scanner;

public class Main {
    private Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
      Main m = new Main();

        m.firstTask();
        m.secondTask();
        m.thirdTask();
        m.fourthTask();
        m.fifthTask();
        m.sixthTask();
        m.seventhTask();
    }

    private void firstTask(){
        int a,b,c;
        System.out.println("Input 3 values: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println("Min value: " + Math.min(Math.min(a,b),c));
    }

    private void secondTask(){
        int a,b,c;
        System.out.println("Input 3 values: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println("Max value: " + Math.max(Math.max(a,b),c));
        System.out.println("Min value: " + Math.min(Math.min(a,b),c));
    }

    private void thirdTask() {
        int a, b, c;
        System.out.println("Input 3 values: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if (a == b && b == c)
            System.out.println("There is no minimum:");
        else {
            int[] numbers = {a, b, c};
            int min = Math.min(Math.min(a, b), c);
            for (int elem : numbers) {
                if (elem == min)
                    System.out.print(elem + " ");
            }
        }
    }

    private void fourthTask(){
        int a;
        a = in.nextInt();
        if(a%2 != 0)
            System.out.println("Value is not even");
        else
            System.out.println("Value is even");
    }

    private void fifthTask(){
        int a,b;
        a = in.nextInt();
        b = in.nextInt();
        if(a%b == 0)
            System.out.printf("Number %d divided by number %d without remainder", a, b);
        else
            System.out.printf("Number %d not divided by number %d without remainder", a, b );
    }

    private void sixthTask(){
        int b,c;
        b = in.nextInt();
        c = in.nextInt();
        if(Math.abs(10 - b) == Math.abs(10 - c))
            System.out.println("Values at the same distance");
        else if(Math.abs(10 - b) < Math.abs(10 - c))
            System.out.printf("Value %d is closer", b);
        else
            System.out.printf("Value %d is closer", c);
    }

    private void seventhTask() {
        int days, rent, discount = 0;
        days = in.nextInt();
        if (days > 7)
            discount = 50;
        else if (days > 5)
            discount = 20;
        rent = days * 40 - discount;
        System.out.println("Rent: " + rent);
    }

}
