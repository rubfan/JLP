import java.util.Scanner;

public class prePrevious {

    public static void quickSort(int arr[], int start, int finish) {
        if (start < finish) {
            int separationIndex = separation(arr, start, finish);

            quickSort(arr, start, separationIndex - 1);
            quickSort(arr, separationIndex + 1, finish);
        }
    }

    private static int separation(int arr[], int begin, int end) {
        int kernel = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= kernel) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

    public static int binarySearch(int[] sortedArray, int key, int right, int left) {
        int middle = (right + left) / 2;

        if (left < right) {
            return -13;
        }

        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return binarySearch(sortedArray, key, right, middle - 1);
        } else {
            return binarySearch(sortedArray, key, middle + 1, left);
        }
    }

    public static int prePreviousElement(int[] array, int number) {
        return (array[binarySearch(array, number, 0, array.length) - 1]);
    }

    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        return array;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = inputArray();
        quickSort(array, 0, array.length - 1);
        System.out.println("Enter element you want to find the previous of: ");
        int number = input.nextInt();
        System.out.println(prePreviousElement(array, number));
    }
}
