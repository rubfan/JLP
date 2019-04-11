import java.util.Scanner;

public class HomeWorkL6 {

    public static void main(String[] args) {
        HomeWorkL6 hw = new HomeWorkL6();
        hw.ex1();
        hw.ex2();
        hw.ex3();
        hw.ex4();
        hw.ex5();
        hw.ex6();
        hw.ex7();
        hw.ex8();
        hw.ex9();
        hw.ex10();
        hw.ex11();
    }


    private void ex1() {

        for (int i = 1000; i < 10000; i += 3) {
            System.out.println(i);
        }
    }


    private void ex2() {

        for (int i = 1, j = 1; i < 55; i++, j = j + 2) {
            System.out.println(j);
        }
    }


    private void ex3() {

        for (int i = 90; i > 0; i -= 5) {
            System.out.println(i);
        }
    }


    private void ex4() {
        for (int i = 1, j = 2; i <= 20; i++, j = j * 2) {
            System.out.println(j);
        }
    }


    private void ex5() {
        int[] a = {33, 13, 7, 23, 55};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += a[i];
            System.out.println(sum);
        }
    }


    private void ex6() {
        int[] a = new int[]{44, 35, 13, 776, 50};
        int min = a[0];
        int max = a[0];

        for(int i = 0; i < a.length; i++){

            if(min > a[i]){
                min = a[i];
            }
            else if(max < a[i]){
                max = a[i];
            }

        }
        System.out.println("Min: " + min + ", max: " + max);

    }


    private void ex7() {
        int[] a = {22, 35, 56, 13};
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            } else {
                sum2 += a[i];
            }
        }
        System.out.println("Сумма четных: " + sum + ", сумма нечетных: " + sum2 );
    }


    private void ex8(){

        for(int i = 100000; i < 1000000; i++){
            int num1 = i/100000;
            int num2 = (i/10000)%10;
            int num3 = (i/1000)%10;
            int num4 = (i/100)%10;
            int num5 = (i/10)%10;
            int num6 = i%10;
            if((num1 + num2 + num3) == (num4 + num5 + num6)){
                System.out.println(i);
            }

        }
    }


    private void ex9() {
        int num = 144;
        String convert = Integer.toBinaryString(num);
        System.out.println(convert);

    }

    private void ex10() {
        int[] a = new int[]{44, 35, 13, 37, 776, 50};
        int min = a[0];

        for(int i = 0; i < a.length; i++){

            if(min > a[i]){
                min = a[i];
            }
        }
        int min2 = a[0];
        for(int i = 0; i < a.length; i++){

            if(min2 > a[i] && min < a[i]){
                min2 = a[i];
            }
        }
        int min3 = a[0];
        for(int i = 0; i < a.length; i++){

            if(min3 > a[i] && min2 < a[i] && min < a[i]){
                min3 = a[i];
            }
        }
        System.out.println("Min: " + min + ", " + min2 + ", " + min3);

    }
    private void ex11(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input num: ");
        int a = sc.nextInt();
        while (a>9){
            a = digitalRoot(a,getIndex(a));
        }
        System.out.println(a);
    }

    protected int getIndex(int a){
        int count = 0;
        while (a>0){
            a = a/10;
            count++;
        }
        return count;
    }

    protected int digitalRoot(int a, int index){
        int root=0;
        int[] mass = new int[index];
        for(int i =0; i<index; i++) {
            mass[i] = (a % 10);
            a = a / 10;
        }
        for (int i = 0; i<index; i++)
            root += mass[i];
        return root;
    }

}

