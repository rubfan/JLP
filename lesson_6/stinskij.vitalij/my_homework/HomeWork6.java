import java.util.Arrays;
import java.util.Scanner;

public class HomeWork6 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
       HomeWork6 m = new HomeWork6();
        for(int i = 1; i < 12; i++) {
            System.out.println(i + ". task");
        }
        System.out.print("Choose task: ");
       int task = in.nextInt();
       switch (task){
           case 1:
             m.task1();
             break;
           case 2:
             m.task2();
             break;
           case 3:
             m.task3();
             break;
           case 4:
             m.task4();
             break;
           case 5:
             m.task5();
             break;
           case 6:
             m.task6();
             break;
           case 7:
             m.task7();
             break;
           case 8:
             m.task8();
             break;
           case 9:
             m.task9();
             break;
           case 10:
             m.task10();
             break;
           case 11:
             m.task11();
             break;
     }
    }

    private void task1(){
        int a = 1000;
        while (a < 10000){
            System.out.println(a);
            a = a + 3;
        }
    }

    private void task2(){
        int a = 1;
        for(int i =0 ; i < 55; i ++)
            System.out.println(a = a + 2);
    }

    private void task3(){
       int a = 90;
       while (a > -5){
           System.out.println(a);
           a = a - 5;
       }
    }

    private void task4(){
        int a =2;
        System.out.println(a);
        for(int i = 0; i < 20; i++) {
            System.out.println(a = a * 2);
        }
    }

    private void task5(){
        int[] mass = initializeOfMass();
        System.out.print("Input n: ");
        int n = in.nextInt();
        System.out.println("Answer: " + additionMassByIndex(mass,n));
    }

    protected int[] initializeOfMass(){
        System.out.print("Input quantity of mass: ");
        int quantity = in.nextInt();
        int[] mass = new int[quantity];
        System.out.println("Input mass: ");
        for(int i =0; i<mass.length; i++)
            mass[i] = in.nextInt();
        return mass;
    }

    protected int additionMassByIndex(int[] mass, int n){
        int answ=0;
        for (int i = 0; i<n; i++)
            answ += mass[i];

        return answ;
    }

    private void task6(){
        int[] mass = initializeOfMass();
        Arrays.sort(mass);
        System.out.printf("Min: %d Max: %d", mass[0],mass[mass.length-1]);
    }

    private void task7(){
        int[] mass = initializeOfMass();
        int[] evenOdd = additionEvenAndOddMassCell(mass);

        System.out.println("Even: " + evenOdd[0]);
        System.out.println("Odd: " + evenOdd[1]);
    }

    protected int[] additionEvenAndOddMassCell(int[] mass){
         int[] evenOdd = new int[2];
        for(int i = 0; i<mass.length;i=i+2)
            evenOdd[1] += mass[i];
        for(int j = 0; j<mass.length-1;j=j+2)
            evenOdd[0] += mass[j+1];
         return evenOdd;
    }

    private void task8(){
         int ticket = 100000;
         while (ticket <= 999999){
             if(addingNumbers(ticket))
                 System.out.println("Lucky ticket :" + ticket);
             ticket++;
         }
    }

    protected boolean addingNumbers(int ticket){
        int firstPart = 0;
        int secondPart = 0;
        int[] a = new int[6];
        for(int i =0; i<6; i++) {
            a[i] = (ticket % 10);
            ticket = ticket / 10;
        }
        for(int i =0; i < 3;i++) {
            firstPart += a[i];
        }
        for(int i = 6; i > 3; i--)
            secondPart += a[i-1];
        return firstPart == secondPart;
    }

    private void task9(){
        System.out.print("Input num: ");
        int a = in.nextInt();
        System.out.println(Integer.toBinaryString(a));
    }

    private void task10(){
        int[] mass = initializeOfMass();
        Arrays.sort(mass);
        for(int i =0; i<5; i++)
            System.out.println(mass[i]);
    }

    private void task11(){
        System.out.print("Input num: ");
        int a = in.nextInt();
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