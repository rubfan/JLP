public class FibWithRec {

    public static int fibr(int n)
    {
        if(n == 1)
            return 1;
        if(n == 2)
            return 1;
        else
            return fibr(n - 1) + fibr(n - 2);
    }
    public static void main(String[] args)
    {
        System.out.println(fibr(9));
    }
}
