import java.util.Arrays;
import java.util.Random;

public class Task1 {
//    Сделайте сортировку выборкой, когда нужно найти минимальный элемент
//    и посчитайте сколько на нее отводится операций(времени) попробуйте
//    увеличить количество элементов в массиве и оценить на сколько увеличится время

    public static void main(String[] args) {

        int[] arr1 = randomArray(10);
        int[] arr2 = randomArray(50);
        int op1, op2;
        long timeTemp;
        long delta1, delta2;

        System.out.println("=====Array1=====");
        System.out.println(Arrays.toString(arr1));
        timeTemp = System.nanoTime();
        op1 = selSort(arr1);
        delta1 = System.nanoTime() - timeTemp;
        System.out.println("Sorting takes " + op1 + " operations(" + delta1 + "nanoSec)");

        System.out.println("=====Array2=====");
        System.out.println(Arrays.toString(arr2));
        timeTemp = System.nanoTime();
        op2 = selSort(arr2);
        delta2 = System.nanoTime() - timeTemp;
        System.out.println("Sorting takes " + op2 + " operations(" + delta2 + "nanoSec)");

        System.out.println();
        System.out.println("Увеличение массива в " + arr2.length / arr1.length  +
                " раз(а) привело к увеличению количества операций, при сортировке, в " + op2 / op1 +" раз(а);");
        System.out.println("При этом время выполнения сортировки увеличилось в " + delta2 / delta1 + " раз(а)");
    }

    // Сортирует массив, возвращает кол-во операций
    private static int selSort (int[] arr){
        int min, temp;
        int op = 0;
        for (int i = 0; i < arr.length-1; i++){
            min = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[min]) {
                    min = j;
                }
                op++;
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            op += 3; // Если считать что обмен это три операции
        }
        return op;
    }

    // Генератор массива случайных элементов
    private static int [] randomArray(int size){
        Random rand = new Random();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
}
