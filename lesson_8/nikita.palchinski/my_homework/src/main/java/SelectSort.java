import java.util.Scanner;

public class SelectSort {
    public static int selectionSort (int[] array){
        int min, temp;
        int counter = 0;

        for (int index = 0; index < array.length-1; index++){
            min = index;
            counter++;
            for (int search = index+1; search < array.length; search++){
                if (array[search] < array[min])
                {
                    min = search;
                    counter++;
                }
                counter++;
            }
            temp = array[min];
            array[min] = array[index];
            array[index] = temp;
            counter += 3;
        }
        return counter;
    }
    public static void input(int[] array, String number){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the " + number + " array's elements: ");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = a.nextInt();
        }
    }
    public static void output(int[] array){
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] array1 = new int[]{2, 5, 7, 8, 3, 0, 2, 6, 7, 8};
        long startTime = System.currentTimeMillis();
        int s1 = selectionSort(array1);
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Program spent " + timeSpent + " mss");
        output(array1);
        System.out.println("Number of operations: " + s1);

        int[] array2 = new int[]{2, 5, 17, 13, 77, 65, 34, 89, 77, 54,
                           65, 8, 3, 0, 2, 6, 7, 8, 12, 33};
        long startTime2 = System.currentTimeMillis();
        int s2 = selectionSort(array2);
        long timeSpent2 = System.currentTimeMillis() - startTime2;
        System.out.println("Program spent " + timeSpent2 + " mss");
        System.out.println("It took " + (timeSpent2 - timeSpent) + " mss longer");
        output(array2);
        System.out.println("Number of operations: " + s2);
        System.out.println("Difference is: " + (Math.abs(s1 - s2)));

    }
}
