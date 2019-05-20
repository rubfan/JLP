import java.util.Scanner;

public class SplittedMassives {
    public static void main(String[] args){
        SelectSort sort = new SelectSort();
        System.out.println("Enter sizes of the first and the seond arrays: ");
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        //initialization
        int i;
        sort.input(array1, "1");
        sort.input(array2, "2");
        //splitting
        int[] splitted = new int[size1 + size2];
        for(i = 0; i < size1; i++) {
            splitted[i] = array1[i];
        }
        for(i = size1; i < splitted.length; i++) {
            splitted[i] = array2[i - size1];
        }
        sort.selectionSort(splitted);
        System.out.println("Result of sorting: ");
        sort.output(splitted);

    }
}
