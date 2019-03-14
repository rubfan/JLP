import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a, b, c, firstNumber, secondNumber;

        System.out.println("Введите первое число:");
        a = sc.nextInt();
        System.out.println("Введите второе число:");
        b = sc.nextInt();
        System.out.println("Введите третье число:");
        c = sc.nextInt();

        System.out.println("Task1:");
        System.out.println("Минимальное из 3 чисел: " + findMinimum(a,b,c));
        System.out.println("Task2:");
        System.out.println("Минимальное из 3 чисел: " + findMinimum(a,b,c));
        System.out.println("Максимальное из 3 чисел: " +findMaximum(a,b,c));

        System.out.println("Task4:");
        System.out.println("Первое число: " + evenOrOddMethod(a));
        System.out.println("Task5:");
        System.out.println("Первое число делится на второе:");
        dividingMethod(a,b);
        System.out.println("Task6:");
        System.out.println("Введите первое число:");
        firstNumber = sc.nextInt();
        System.out.println("Введите второе число:");
        secondNumber = sc.nextInt();
        System.out.println("Ближайшее число к 10: " + theNearestNumber(firstNumber,secondNumber));
        System.out.println("Task7:");
        System.out.println("Введите количество дней :");
        int amountOfDays= sc.nextInt();
        System.out.println(costOfRent(40, amountOfDays));

    }
    private static int costOfRent(int costPerDAY, int amountOfDays){
        int result =costPerDAY*amountOfDays;
        if(amountOfDays>5 && amountOfDays<=7) result -=20;
        if(amountOfDays>7) result -=50;
        return  result;
    }

    private static int theNearestNumber(int a, int b) {
        int firstDisparity, secondDisparity;
        firstDisparity = Math.abs(10-a);
        secondDisparity = Math.abs(10-b);

        if(firstDisparity < secondDisparity) return  a;
        else return b;
    }
    private static void dividingMethod(int a, int b) {
        if ( b==0){
            System.out.println("на ноль делить нельзя");
        }
        if(a%b==0){
            System.out.println("без остатка");
        }
        else {
            System.out.println("с остатком");
        }
    }
    private static String evenOrOddMethod(int a) {
        if(a==0) return "0 ни четное, ни нечетное";
        if(a%2==0) return "Четное";
        else return "Нечетное";
    }

    private static int findMaximum(int a, int b, int c) {
        int array[] = new int[]{a, b, c};
        int max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max)  max = array[i];
        }
        return  max;
    }

    private static int findMinimum(int a, int b, int c) {
        int array[] = new int[]{a, b, c};
        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min)  min = array[i];
        }
        return  min;
    }
}
