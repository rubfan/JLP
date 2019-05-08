package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please specify your satisfaction: terrible, poor, good, great, excellent");
        Scanner scanner = new Scanner(System.in);
        String satisfaction = scanner.nextLine();
        System.out.println("Please enter the bill amount:");
        int billAmount = scanner.nextInt();

        switch (satisfaction){
            case ("terrible"):
                System.out.println(0);
                break;
            case ("poor"):
                System.out.println(billAmount*0.05);
                break;
            case ("good"):
                System.out.println(billAmount*0.1);
                break;
            case ("great"):
                System.out.println(billAmount*0.15);
                break;
            case ("excellent"):
                System.out.println(billAmount*0.2);
                break;
        }

    }
}
