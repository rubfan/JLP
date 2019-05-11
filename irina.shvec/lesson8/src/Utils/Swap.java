package Utils;

public class Swap {
    public static void swap (int [] a, int ind1, int ind2){
        int old = a[ind1];
        a[ind1] = a[ind2];
        a[ind2] = old;
    }
}
