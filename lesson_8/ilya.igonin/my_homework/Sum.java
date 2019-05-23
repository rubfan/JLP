public class Sum {
    public static void main(String[] args) {
        int[] a = {2, 4, 9, 13, 20};
        int sum = 13;
        int n1;
        int n2;
        boolean b = false;
        for (int i = 0; i < a.length; i++) {
            n1 = a[i];

            for (int j = 0; j < a.length; j++) {
                n2 = a[j];

                if (n1 + n2 == sum) {
                    b = true;

                }
            }
        }
        System.out.println(b);
    }
}