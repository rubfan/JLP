import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        from1000To10000();
        firts55Numbers();
        from90To0();
        progression();
        arrayOperations();
        luckyTicket();
        intToBin();
        first5Elements();
        digitalRoot();
    }

    public static void from1000To10000() {
        for (int i = 1000; i < 10000; i = i + 3) {
            System.out.println(i);
        }
    }

    public static void firts55Numbers() {
        int i = 0;
        int x = 1;
        while (i < 55) {
            System.out.println(x);
            x = x + 2;
            i++;
        }
    }

    public static void from90To0() {
        for (int i = 90; i > 0; i = i - 5) {
            System.out.println(i);
        }
    }

    public static void progression() {
        int i = 0;
        int x = 2;
        while (i < 20) {
            System.out.println(x);
            x = x * 2;
            i++;
        }
    }

    public static void arrayOperations() {
        //find sum of n elements of array
        System.out.println("Please enter the lenght of array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        //min max
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        //pair
        int pair = 0;
        int notPair = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                pair = pair + array[i];
            else
                notPair = notPair + array[i];
        }
    }

    public static void luckyTicket() {
        for (int i = 100000; i <= 999999; i++) {
            int n1 = i / 100000;
            int n2 = i / 10000 % 10;
            int n3 = i / 1000 % 10;
            int n4 = i / 100 % 10;
            int n5 = i / 10 % 10;
            int n6 = i % 10;
            if ((n1 + n2 + n3) == (n4 + n5 + n6)) {
                System.out.println(n1 + "" + n2 + "" + n3 + "=" + n4 + "" + n5 + "" + n6);
            }
        }
    }

    public static void intToBin() {
        int i = 100;
        String b = Integer.toBinaryString(i);
        System.out.println(b);
    }

    public static void first5Elements() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            //элементу массива присваивается случайное число от 0 до 99
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }

    public static void digitalRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        String i = scanner.nextLine();
        int result = Integer.parseInt(i);
        System.out.println(i.length());
        int sum = 0;
        while (result > 9) {
            for (int a = 0; a < i.length(); a++) {
                sum = sum + i.charAt(a);
            }
            i = String.valueOf(sum);
            result = Integer.parseInt(i);
        }
        System.out.println(result);
    }
}


