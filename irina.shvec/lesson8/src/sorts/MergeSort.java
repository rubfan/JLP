package sorts;
import java.util.Arrays;
/*Есть 2 массива упорядоченных по возрастанию. Получите 3й массив,
 который объединит все эти элементы, но также в возрастающем порядке.*/

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 8, 9, 12};
        System.out.println(Arrays.toString(merge(a, b)));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] resultArr = new int[(arr1.length + arr2.length)];
        int firstInd1 = 0;//index of first element arr1
        int firstInd2 = 0;//index of first element arr2
        int i = 0;
        while (firstInd1 < arr1.length && firstInd2 < arr2.length) {
            if (arr1[firstInd1] <= arr2[firstInd2]) {
                resultArr[i++] = arr1[firstInd1++];
            } else {
                resultArr[i++] = arr2[firstInd2++];
            }
        }
        while (firstInd1 < arr1.length) {
            resultArr[i++] = arr1[firstInd1++];
        }
        while (firstInd2 < arr2.length) {
            resultArr[i++] = arr2[firstInd2++];
        }
        return resultArr;
    }
}
