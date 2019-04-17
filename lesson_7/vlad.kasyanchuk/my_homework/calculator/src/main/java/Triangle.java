public class Triangle {
    public static void main(String[] args) {
        //треугольником Паскаля

        int number = 5;
        int[][] array = new int[number][number];
        for (int n = 0; n <= array.length - 1; n++) {
            array[n][0] = array[n][n] = 1;
            for (int k = 1; k < n; k++) {
                array[n][k] = array[n - 1][k - 1] + array[n - 1][k];
            }
        }
        for (int n = 0; n <= number; n++) {
            for (int k = 0; k <= n; k++) {
                System.out.print(array[n][k] + " ");
            }
            System.out.println();
        }
    }
}