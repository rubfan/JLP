import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random r = new Random();
        for(int i = 0; i<arr.length; i++){
            arr[i] = r.nextInt(100);
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        long startTime = System.nanoTime();
        sort(arr);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);
    }
    public static void sort(int[] arr) {
        //long startTime = System.nanoTime();
        for (int min = 0; min < arr.length; min++) {
            int least = min;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[least];
            arr[least] = tmp;
            System.out.print(arr[min] + " ");
        }
       // long estimatedTime = System.nanoTime() - startTime;
       // System.out.println(estimatedTime);
    }
}
