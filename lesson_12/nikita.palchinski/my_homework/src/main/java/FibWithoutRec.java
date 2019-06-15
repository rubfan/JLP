public class FibWithoutRec {

    public static int fib(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        else {
            int[] fibs = new int[n];
            fibs[0] = 1;
            fibs[1] = 1;
            for (int i = 2; i < n; i++)
                fibs[i] = fibs[i - 1] + fibs[i - 2];
            return fibs[n - 1];
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(9));
    }
}

