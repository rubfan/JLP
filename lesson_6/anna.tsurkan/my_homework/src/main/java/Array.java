import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private Scanner scanner = new Scanner(System.in);



    public int summaOfEl(int size, int count){
        int[] array = new int[size];
        int number =1, summa=0;
        for (int i=0; i<array.length; i++){
            array[i]=number;
            number++;
        } //инициализация
         for (int i=0; i<count; i++){
            summa = summa+array[i];
        }
           return  summa;
    }


    public void findMaxAndMin(int size){
        System.out.println("Enter number for array: ");
        int[] array = new int[size];
        for (int i=0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }
        //инициализация
        int max =array[0], min=array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max)  max = array[i];
            if(array[i] < min)  min = array[i];
        }
        System.out.println("Maximum is: " +   max);
        System.out.println("Minimum is: " +   min);

    }

    public void sumOfPair(int size){
        System.out.println("Enter number for array: ");
        int[] array = new int[size];
        for (int i=0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }
        //инициализация

        int summaPair=0, summaUnPair=0;
        for(int i = 0; i < array.length; i++) {
           if(array[i]%2==0 ){
               summaPair=summaPair + array[i];
           }
           else{
               summaUnPair = summaUnPair + array[i];
           }
        }
        System.out.println("Summa of pair numbers: " + summaPair);
        System.out.println("Summa of unpair numbers: " + summaUnPair);

    }
    public void getFiveMinimum(){
        System.out.println("Enter number for array: ");
        int[] array = new int[10];
        for (int i=0; i < 10; i++)
        {
            array[i] = scanner.nextInt();
        }
        //инициализация
        Arrays.sort(array);
        for(int g=0; g<4;g++ ){
            System.out.print(array[g] + " ");

        }

    }







}
