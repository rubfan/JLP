import java.util.Scanner;

public class SumSearch {
    public static void main(String[] args){
        SelectSort sort = new SelectSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        int sum;
        System.out.println("Enter the sum: ");
        sum = sc.nextInt();
        sort.input(array, "1");
        int element;
        int count = 0;
        for(int i = 0; i < array.length; i++){
            element = sum - array[i];
            int s = search(array, element);
            if(s != 0)
            {
                System.out.println("Yes. sum = " + array[i] + " + " + s);
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.println("No.");
        }

    }
    public static int search(int[] array, int element){
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == element) {
                return array[i];
            }
        }
        return 0;
    }
}
