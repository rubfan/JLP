import java.util.Arrays;

public class Task10 {

    //10) Вывести первые 5 минимальных элементов массива
    public static void main(String[] args) {
        int[] arr = MyArrayUtil.RandomArray(50);
        int[] result = new int[5];

        System.out.println("==========ARRAY============");
        MyArrayUtil.PrintArray(arr);

        Arrays.sort(arr);
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i];
        }
        System.out.println(result.length + " minimal elements: ");
        MyArrayUtil.PrintArray(result);
    }
}


