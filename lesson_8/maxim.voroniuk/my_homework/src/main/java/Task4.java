import java.util.Arrays;
import java.util.Random;

public class Task4 {
    //4) Есть массив с числами упорядоченными по возрастанию,
    // нужно определить есть ли в этом массиве 2 числа, сумма которых равна "sum".
    // Пример ввода:
    // a = {1, 5, 7, 9, 12}
    // sum = 12
    // Результат: true - так как 5 + 7 = 12
    // a = {1, 5, 7, 9, 12}
    // sum = 3
    // Результат: false - так как нет двух чисел, которые в сумме дают 3

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = randomArray(10);
        int sum = rand.nextInt(100);

        System.out.println(Arrays.toString(arr));
        System.out.println("Sum: " + sum);

        System.out.println("Result: " + twoNumSum(arr, sum));
    }

    // Генератор массива случайных элементов
    private static int [] randomArray(int size){
        Random rand = new Random();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = rand.nextInt(50);
        }
        return arr;
    }

    private static boolean twoNumSum(int[] arr, int sum){

        int diff;
        boolean result = false;

        for (int i = 0; i < arr.length; i++){
            diff = sum - arr[i];
            for(int j = 0; j < arr.length; j++){
                if(i != j){
                    if(arr[j] == diff){
                        result = true;
                        System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                        break;
                    }
                }
            }
            if(result){
                return result;
            }
        }
        return result;
    }
}
