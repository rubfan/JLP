import java.util.Arrays;
import java.util.Random;

public class ArrayConcat {
    public static void main(String[] args) {

        Random rnd = new Random();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for(int i=0; i < arr1.length; i++){
            arr1[i] = rnd.nextInt(100);
            arr2[i] = rnd.nextInt(100);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int[] arrConcat = new int[arr1.length + arr2.length];
        int i = 0;
        for (int x : arr1) { arrConcat[i] = x; i ++; }
        for (int x : arr2) { arrConcat[i] = x; i ++; }
        System.out.println(Arrays.toString(arrConcat));

        for (int a = 0; a < arrConcat.length; a++) {
            for (int j = 0; j < arrConcat.length-1; j++) {
                if (arrConcat[j] > arrConcat[j + 1]){
                    int tmp = arrConcat[j];
                    arrConcat[j] = arrConcat[j+1];
                    arrConcat[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arrConcat));

    }

}

