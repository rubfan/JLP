public class task2 {
    //2) Есть 2 массива упорядоченных по возрастанию. Получите 3й массив,
    // который объединит все эти элементы, но также в возрастающем порядке.
    // Пример ввода:
    // a = {1, 3, 5}
    // b = {2, 4, 8, 9, 12}
    // Результат:
    // c = {1, 2, 3, 4, 5, 8, 9, 12}

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 22, 33, 45, 46, 59, 73};
        int[] arr2 = {4, 5, 6, 7, 8, 9, 99};
        int[] result = new int[arr1.length + arr2.length];

        PrintArray(arr1);
        PrintArray(arr2);

        int t1 = 0;
        int t2 = 0;
        int j = 0;

        while(j < result.length){
            if(t1 < arr1.length && t2 < arr2.length) {
                if (arr1[t1] < arr2[t2]) {
                    result[j++] = arr1[t1++];
                } else {
                    result[j++] = arr2[t2++];
                }
            }
            else if(t1 == arr1.length){
                result[j++] = arr2[t2++];
            }
            else{
                result[j++] = arr1[t1++];
            }
        }

        PrintArray(result);
    }

    // Вывод массива
    private static void PrintArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
