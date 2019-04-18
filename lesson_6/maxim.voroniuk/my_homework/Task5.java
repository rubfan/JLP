import java.util.Random;

public class Task5 {
//    5) Найти сумму первых n элементов массива
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = MyArrayUtil.RandomArray(50);

        System.out.println("==========ARRAY============");
        MyArrayUtil.PrintArray(arr);

        int count = rand.nextInt(20);
        System.out.println("Sum of first " + count + " elements :" + SumArr(arr,count));
    }

    // Сумма первых count элементов массива arr
    private static long SumArr(int[] arr, int count){
        long sum = 0;
        for (int i = 0; i < count; i++){
            sum += arr[i];
        }
        return sum;
    }
}

