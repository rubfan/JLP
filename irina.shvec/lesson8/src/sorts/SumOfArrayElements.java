package sorts;

import java.util.Arrays;

public class SumOfArrayElements {

    /*Есть массив с числами упорядоченными по возрастанию,
     нужно определить есть ли в этом массиве 2 числа,
      сумма которых равна "sum"*/

    public static void main(String[] args) {
        int[] a = {1, 5, 7, 9, 12};
        int sum = 1;
        System.out.println(findPair(a, sum));

    }

    public static boolean findPair(int[] a, int s) {
        for (int i = 0; i < a.length; i++) {
            int secondNum = s - a[i];
            int secondNumInd = Arrays.binarySearch(a, secondNum);
            while (secondNumInd > -1) {
                if ((a[i] + a[secondNumInd]) == s) {
                    return true;
                }
            }
        }
        return false;
    }
}
