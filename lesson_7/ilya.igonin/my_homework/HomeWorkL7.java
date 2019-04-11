public class HomeWorkL7 {
    public static void main(String[] args) {
        HomeWorkL7 hw = new HomeWorkL7();
        hw.ex1();
        hw.ex2();
    }


    private void ex1(){

        int bound = 8;
        int[][] a = new int[bound+1][bound+1];
        for (int n = 0; n <= bound; n++) {
            a[n][0] =a [n][n] = 1;
            for (int k = 1; k < n; k++) {
                a[n][k] = a[n - 1][k - 1] + a[n - 1][k];
            }
        }

        for (int n = 0; n <=bound; n++) {
            for (int k = 0; k <= n; k++) {
                System.out.print(a[n][k] + " ");
            }
            System.out.println();
        }
    }

    private void ex2(){
        int n = 4;
        int[][] a = new int[n][n];

        int row = 0;
        int col = 0;
        int dx = 1;
        int dy = 0;
        int dirChanges = 0;
        int visits = n;

        for (int i = 0; i < n * n; i++) {
            a[row][col] = i + 1;
            if (--visits == 0) {
                visits = n * (dirChanges % 2) +
                        n * ((dirChanges + 1) % 2) -
                        (dirChanges / 2 - 1) - 2;
                int temp = dx;
                dx = -dy;
                dy = temp;
                dirChanges++;
            }
            col += dx;
            row += dy;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
    }
}

