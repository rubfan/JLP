import java.util.Random;

// Методы для работы с массивом
public class MyArrayUtil {
    // Генератор случайного массива
    public static int [] RandomArray(int size){
        Random rand = new Random();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
    // Вывод массива
    public static void PrintArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
