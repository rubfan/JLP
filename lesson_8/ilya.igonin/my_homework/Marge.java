import java.lang.reflect.Array;
import java.util.Arrays;

public class Marge {
    public static void main(String[] args) {

        int[] a = {1, 3, 5};
        int[] b = {2, 4, 8, 9, 12};
        int[] ab = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length)
        {
            if (a[i] < b[j])
            {
                ab[k] = a[i];
                i++;
            }
            else
            {
                ab[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length)
        {
            ab[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length)
        {
            ab[k] = b[j];
            j++;
            k++;
        }

        for(k  = 0; k < ab.length; k++){
            System.out.println(ab[k]);
        }

    }
}
