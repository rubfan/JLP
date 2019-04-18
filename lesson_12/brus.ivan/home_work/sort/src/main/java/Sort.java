import java.util.Arrays;

public class Sort {

    public int quickSort(int[] arr, int start, int end) {

        int middle = start + (end - start) / 2;
        int current = arr[middle];

        int i = start, j = end;
        while (i <= j) {
            while (arr[i] < current) {
                i++;
            }

            while (arr[j] > current) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (start < j) quickSort(arr, start, j);

        if (end > i) quickSort(arr, i, end);

        return arr[arr.length-2];
    }

    public static int binarySearch(int[] array, int key, int left, int right)
    {
        int mid = left + (right - left) / 2;

        if (array[mid] == key) return mid;

        else if (array[mid] > key) return binarySearch(array, key, left, mid);

        else return binarySearch(array, key, mid + 1, right);
    }

}
