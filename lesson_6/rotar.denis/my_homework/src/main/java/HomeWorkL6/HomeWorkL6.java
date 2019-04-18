package HomeWorkL6;

import java.util.Scanner;

public class HomeWorkL6 {
    public static void main(String[] args) {
        int NumTask;

        Scanner in = new Scanner (System.in);
        HomeWorkL6 hw = new HomeWorkL6();

        System.out.println("Enter the number of Task from 1 to 11:");
        NumTask = in.nextInt();

        switch (NumTask) {
            case 1:	hw.Task_1 ();
                break;
            case 2:	hw.Task_2 ();
                break;
            case 3:	hw.Task_3 ();
                break;
            case 4:	hw.Task_4 ();
                break;
            case 5:	hw.Task_5 ();
                break;
            case 6:	hw.Task_6 ();
                break;
            case 7:	hw.Task_7 ();
                break;
            case 8:	hw.Task_8 ();
                break;
            case 9:	hw.Task_9 ();
                break;
            case 10:	hw.Task_10 ();
                break;
            case 11:	hw.Task_11 ();
                break;
            default: System.out.println("From 1 to 11");
                break;
        }
    }

    private void Task_1() {

        for (int i = 1000; i < 10000; i += 3) {
            System.out.println(i);
        }
    }

    private void Task_2() {

        for (int i = 1; i < 55; i++) {
            for (int k = 1; ; k += 2) {
                System.out.println(k);
            }
        }
    }

    private void Task_3() {
        for (int i = 90; i > 0; i -= 5) {
            System.out.println(i);
        }
    }

    private void Task_4() {
        for (int i = 1; i <= 20; i++) {
            for (int k = 2; ; k *= 2) {
                System.out.println(k);
            }
        }
    }

    private void Task_5() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += array[i];
            System.out.println(sum);
        }
    }

    private void Task_6() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int minimum = array[0];
        int maximum = array[0];

        for(int i = 0; i < array.length; i++){

            if(minimum > array[i]){
                minimum = array[i];
            }
            else if(maximum < array[i]){
                maximum = array[i];
            }

        }
        System.out.println("Min: " + minimum + ", max: " + maximum);

    }

    private void Task_7() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumeven = 0;
        int sumodd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumeven += array[i];
            } else {
                sumodd += array[i];
            }
        }
        System.out.println("Сумма четных: " + sumeven + ", сумма нечетных: " + sumodd );
    }

    private void Task_8(){
        for (int i = 100000; i <= 999999; i++) {
            int number1, number2, number3, number4, number5, number6;
            number1 = i / 100000;
            number2 = (i / 10000) % 10;
            number3 = (i / 1000) % 10;
            number4 = (i / 100) % 10;
            number5 = (i /10) % 10;
            number6 = i % 10;
            if (number1 + number2 + number3 == number4 + number5 + number6) {
                System.out.println(number1 + "" + number2 + "" + number3 + "" + number4 + "" + number5 + "" + number6);
            }
        }
    }

    private void Task_9() {
        int num = 8;
        String numbin = Integer.toBinaryString(num);
        System.out.println(numbin);

    }

    private void Task_10() {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( array[j] > array[j+1] ){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        System.out.print("The first five minimums are: ");
        for(int o = 0; o < 5; o++) {
            System.out.print(array[o] + " ");
        }
    }

    private void Task_11(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = in.nextInt();
        while (number>9){
            number = sumOfNumbersInNumber(number,getSteps(number));
        }
        System.out.println(number);
    }

    protected int getSteps(int number){
        int quantityOfSteps = 0;
        while (number>0){
            number = number/10;
            quantityOfSteps++;
        }
        return quantityOfSteps;
    }

    protected int sumOfNumbersInNumber(int number, int quantityOfSteps){
        int sum=0;
        int[] array = new int[quantityOfSteps];
        for(int i =0; i<quantityOfSteps; i++) {
            array[i] = (number % 10);
            number = number / 10;
        }
        for (int i = 0; i<quantityOfSteps; i++)
            sum += array[i];
        return sum;
    }
}