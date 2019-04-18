package sorts;
import Utils.Swap;

public class SelectionSort {
   /* Сделайте сортировку выборкой, когда нужно найти минимальный элемент
    и посчитайте сколько на нее отводится операций(времени) попробуйте увеличить
     количество элементов в массиве и оценить на сколько увеличится время*/

    public static void getSort(int[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = minIndex + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            Swap.swap(arr, minIndex, i);
        }
    }

    public static void show(int[] arr) {
        for (int element : arr) {
            System.out.print(element + ", ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 0, 2, 4, 1};
        getSort(arr);
        show(arr);
        O(arr.length);
    }

    public static void O(int n){
        int O = n*n; //quantity of operations where n is number of elements
    }
}
