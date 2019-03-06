package my_homework;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        getMin();
        getMinMax();
        getAllMin();
        isEvenNum();
        isRemainderOfDev();
        getNumCloser10();
        countRent();
    }

    public static void getMin () {
        System.out.println("Please, enter three digits of which need to find the minimum");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt(), secondNum = sc.nextInt(), thirdNum = sc.nextInt();
        int minNum = Math.min(firstNum,Math.min(secondNum,thirdNum));
        System.out.printf("Minimum value: %d \n", minNum);
    }
    public static void getMinMax () {
        System.out.println("Please, enter three digits of which need to find the minimum and maximum");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt(), secondNum = sc.nextInt(), thirdNum = sc.nextInt();
        int minNum = Math.min(firstNum,Math.min(secondNum,thirdNum));
        int maxNum = Math.max(firstNum,Math.max(secondNum,thirdNum));
        System.out.printf("Minimum value: %d, maximum value: %d \n", minNum,maxNum);
    }
    public static void getAllMin(){
        System.out.println("Please, enter three digits of which need to find all minimums");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt(), secondNum = sc.nextInt(), thirdNum = sc.nextInt();
        if (firstNum <= secondNum && firstNum <= thirdNum) {
            System.out.println("Minimal number: " + firstNum);
        }
        if (secondNum <= thirdNum && secondNum <= firstNum) {
            System.out.println("Minimal number: " + secondNum);
        }
        if (thirdNum <= firstNum && thirdNum <= secondNum) {
            System.out.println("Minimal number: " + thirdNum);
        }

    }
    public static void isEvenNum(){
        System.out.println("Please, enter the digit to determine evenness or unevenness");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = (num % 2);
        if (result==0){
            System.out.println("You entered an even number");
        } else {
            System.out.println( "You entered an add number");
        }
    }
    public static void isRemainderOfDev(){
        System.out.println("Please, enter two digits. Is there the remainder after division?");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        if((num1 % num2)==0){
            System.out.println("There are NO remainders after division!");
        }else {
            System.out.println("There are remainders after division!");
        }
    }
    public static void getNumCloser10(){
        System.out.println("Please, enter two digits. Which is closer to 10?");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            System.out.println("Number closest to 10 is " + a);
        } else if (Math.abs(a - 10) == Math.abs(b - 10)) {
            System.out.println("Numbers  close to 10 the same");
        } else {
            System.out.println("Number closest to 10 is " + b);
        }
    }
    public static void countRent(){
        System.out.println("Please, enter how many days you need for rent ");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int rent;
        if (days < 5 && days >= 0){
            rent = days * 40;
            System.out.println("You need to pay for the rent " + rent);
        }else if (days >= 5 && days <= 7){
            rent = days * 40 - 20;
            System.out.printf("You need to pay for the rent %d grn \n",rent);
        }else if (days > 7){
            rent = days * 40 - 50;
            System.out.printf("You need to pay for the rent %d grn \n",rent);
        }else {
            System.out.println("You entered incorrect number ");
        }

    }


}
