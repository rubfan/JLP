import java.util.Arrays;
import java.util.Random;

public class Selection {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[10];
        for(int i=0; i < arr.length; i++){
            arr[i]=random.nextInt(100);
        }

        long startTime = System.nanoTime();
        System.out.println(new Main().selectionSort(arr));
        System.out.println("Время на выполнение = " + (long)(System.nanoTime() - startTime) + "ns");

    }

    String selectionSort (int[] arr){
        int min, temp;
        int count = 0;

        for (int i = 0; i < arr.length-1; i++){
            min = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
                count++;
            }

            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Количество операций для сортировки = " + count);
        return Arrays.toString(arr);
    }
}
