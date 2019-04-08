
public class Task7 {
    public static void main(String[] args) {

        //7) Найти сумму всех четных и сумму всех нечетных элементов массива
        int[] arr = MyArrayUtil.RandomArray(50);

        System.out.println("==========ARRAY============");
        MyArrayUtil.PrintArray(arr);

        int sumEven = 0;
        int sumOdd = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                sumEven += arr[i];
            }
            else
            {
                sumOdd += arr[i];
            }
        }

        System.out.println("Sum of even elements: " + sumEven);
        System.out.println("Sum of odd elements: " + sumOdd);
    }
}
