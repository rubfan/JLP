public class PascalTriangle {
    public static void main(String[] args) {

         int bound=10;
         long array[][]= new long[bound+1][bound+1];
                for (int n = 0; n <= bound; n++) {
                    array[n][0] = array[n][n] = 1;
                    for (int k = 1; k < n; k++) {
                        array[n][k] = array[n-1][k-1] + array[n-1][k];
                    }
                }
                 for (int n = 0; n <=bound; n++) {
                  for (int k = 0; k <= n; k++) {
                System.out.print(array[n][k] + " "); }
                  System.out.println(); }


    }
}
