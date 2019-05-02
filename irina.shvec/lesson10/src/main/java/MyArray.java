/*Написать Класс который позволяет добавлять в масив другой масив а также
 одно значение, возвращать длину масива, и выводить элементы по индексу.
 При добавлении элементов и достижении границы масива он должен
 увеличиваться в размере в 2 раза тоесть N*2.*/


import java.util.Arrays;

public class Array {
    private int length = 0;
    private String[]arr;

    public Array(int length) {
        this.length = arr.length;
    }

    public String[] concatenate(String[] a, String[] b) {
        String[] result = Arrays.copyOf(a, a.length + b.length);
        System.arraycopy(b, 0, result, a.length, b.length);

        return result;
    }

    public String[] addElement(String e) {
        int sum = Arrays.cou;

        if (){
            increaseLength();
        }else {
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = e;
        }
        return arr;
    }
    public static int findElemByIndex(int arr[], int t){
        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[t]){
                element = arr[i];
            }
        }
        return element;
    }

    public void increaseLength(){
        arr = Arrays.copyOf(arr, arr.length*2);
    }



    public static void main(String[] args) {


    }
}
