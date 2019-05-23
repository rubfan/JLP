//Заполните 2-мерный массив по спирали
//Two-dimensional array in spiral order

public class SpiralArr {

    public static void main(String[] args) {
        getSpiral(4);
    }


    public static void getSpiral(int n) {
        int[][] a = new int[n][n];
        int value = 1;
        int firstColInd = 0;
        int firstRowInd = 0;
        int lastColInd = n - 1;
        int lastRowInd = n - 1;

        while (value <= n * n)
        {

            //print the first row
            for (int i = firstColInd; i <= lastColInd; i++) {
                a[firstRowInd][i] = value;
                value++;
            }

            //print the last column
            for (int i = firstRowInd + 1; i <= lastRowInd; i++) {
                a[i][lastColInd] = value;
                value++;
            }

            //print the last row
            for (int i = lastColInd - 1; i >= firstColInd; i--) {
                a[lastRowInd][i] = value;
                value++;
            }

            //print first column
            for (int i = lastRowInd - 1; i >= firstRowInd + 1; i--) {
                a[i][firstColInd] = value;
                value++;
            }
            firstColInd++;
            firstRowInd++;
            lastColInd--;
            lastRowInd--;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

