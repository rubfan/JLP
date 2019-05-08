/*Напишите алгоритм который возращает предпоследнее максимальное
 число из int[] масива c использованием алгоритмов сортировки
 quicksort и бинарного поиска*/

public class Algorithms {
    private static int[] arr = {6, 8, 4, 7, 1, 3,};
    private static int number = 7;
    private static int startIndex = 0;
    private static int endIndex = arr.length - 1;

    public static void main(String[] args) {
        quickSort(startIndex, endIndex);
        show();
        findPrevious();
    }

    private static void quickSort(int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (arr[i] <= arr[cur])) {
                i++;
            }
            while (j > cur && (arr[cur] <= arr[j])) {
                j--;
            }
            if (i < j) {
                swap(i, j);
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        quickSort(start, cur);
        quickSort(cur + 1, end);
    }

    public static boolean isNumberInArr() {
        while (endIndex >= startIndex) {
            int middle = (startIndex + endIndex) / 2;
            if (arr[middle] == number) {
                return true;
            }
            if (arr[middle] < number) {
                startIndex = middle + 1;
            }
            if (arr[middle] > number) {
                endIndex = middle - 1;
            }
        }
        return true;
    }

    public static void findPrevious() {
        if (isNumberInArr()) {
            int i = arr.length - 1;
            do{
                i--;
            }
            while (arr[i] != number && i >= 0);
            System.out.println(arr[i - 1]);
        }
    }


    public static void swap(int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void show() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
