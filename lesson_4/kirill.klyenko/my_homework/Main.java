package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws Exception {
        Main yo = new Main();
        yo.firstTask();
        yo.twoTask();
        yo.threeTask();
        yo.fourTask();
        yo.fifthTask();
        yo.sixTask();
        yo.sevenTask();
    }

    private void firstTask() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        int c = 0;
        try {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
            c = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int g = Math.min(Math.min(a, b), c);
        System.out.println(g);
    }

    private void twoTask() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        int c = 0;
        try {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
            c = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int g = Math.min(Math.min(a, b), c);
        int z = Math.max(Math.max(a, b), c);
        System.out.println("min:" + g + " " + "max:" + z);
    }

    private void threeTask() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = 0;
        int second = 0;
        int third = 0;
        try {
            first = Integer.parseInt(reader.readLine());
            second = Integer.parseInt(reader.readLine());
            third = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (first == second && second == third) {
            System.out.println("All 3 numbers are equal");
        } else {
            int[] numbers = {first, second, third};

            int min = Math.min(Math.min(first, second), third);

            for (int elem : numbers) {
                if (elem == min)
                    System.out.print(elem + " ");
            }
        }
    }

    private void fourTask() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        try {
            a = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (a % 2 == 0)
            System.out.println(a + " :even");
        else System.out.println(a + " :odd");
    }

    private void fifthTask() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (b == 0)
            System.out.println("its cannot be");
        if (a % b == 0)
            System.out.println("even");

        else System.out.println("odd");
    }

    private void sixTask() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        try {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (Math.abs(10 - a) < Math.abs(10 - b))
            System.out.printf("value %d is closer", a);
        else if (Math.abs(10 - a) == Math.abs(10 - b))
            System.out.println("values equals");
        else System.out.printf("value %d is closer", b);
    }

    private void sevenTask() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        try {
            a = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if ((a > 0 && a <= 5))
            System.out.println(a * 40);
        else if (a > 5 && a <= 7)
            System.out.println(a * 40 - 20);
        else if (a > 7)
            System.out.println(a * 40 - 50);
    }

}
