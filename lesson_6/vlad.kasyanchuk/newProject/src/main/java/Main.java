import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Numbers from 1000 to 10000 with inc +3

        for (int i = 1000; i < 10000; i = i + 3){
            System.out.println(i);
        }

//        // First 55 numbers with inc +3

        int i = 0;
        int x = 1;
        while (i < 55){
            System.out.println(x);
            x = x +2;
            i++;
        }

        // Numbers from 90 to 0

        for (int i = 90; i > 0; i = i - 5){
            System.out.println(i);
        }

        //geometric progression of first 20 numbers

        int i = 0;
        int x = 2;
        while (i < 20){
            System.out.println(x);
            x = x*2;
            i++;
        }

        //find sum of n elements of array

        System.out.println("Please enter the lenght of array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
         }
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
            }
        System.out.println(sum);

        int min = array[0];
        int max = array [0];
        for (int i = 0; i < array.length; i++){

            if (array[i]< min ){
                min = array[i];
            }

            if (array[i]> max ){
                max = array[i];
            }

        }
        System.out.println(min);
        System.out.println(max);

        int pair = 0;
        int notPair = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0)
                pair = pair + array[i];
            else
                notPair = notPair + array[i];
        }

        //lucky ticket

        for (int i = 100000; i<=999999; i++){
            int n1 = i/100000;
            int n2 = i/10000%10;
            int n3 = i/1000%10;
            int n4 = i/100%10;
            int n5 = i/10%10;
            int n6 = i%10;
            if ((n1+n2+n3)==(n4+n5+n6)) {
                System.out.println(n1 + "" + n2 + "" + n3 + "=" + n4 + "" + n5 + "" + n6);
            }

        }

        // intToBin

        int i = 100;
        String b = Integer.toBinaryString(i);
        System.out.println(b);

        //first five minimal numbers of array

        int arr[] = new int[10];
        for(int i = 0; i < arr.length; i++) {
            //элементу массива присваивается случайное число от 0 до 99
            arr[i] = (int)(Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }


        for(int i = arr.length  ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;

            }
        }

        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //digital root
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        String i = scanner.nextLine();
        int result = Integer.parseInt(i);
        System.out.println(i.length());
        int sum = 0;
        while (result > 9){
            for (int a = 0; a < i.length(); a++){
                sum = sum +i.charAt(a);
            }
            i = i.valueOf(sum);
            result = Integer.parseInt(i);

        }
        System.out.println(result);







        }
        }


