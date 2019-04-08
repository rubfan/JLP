
public class Task6 {

//    6) Найти минимальный и максимальный элемент массива

    public static void main(String[] args) {

        int[] arr = MyArrayUtil.RandomArray(50);
        System.out.println("==========ARRAY============");
        MyArrayUtil.PrintArray(arr);
        System.out.println("minimum : " + MinArr(arr));
        System.out.println("maximum: " + MaxArr(arr));
    }
    // Возвращает минимальный элемент массива
    private static int MinArr(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    // Возвращает максимальный элемент массива
    private static int MaxArr(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
