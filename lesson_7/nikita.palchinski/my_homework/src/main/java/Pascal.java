import java.util.Scanner;
public class Pascal {


    public static void main(String[] args) {

        Pascal();
    }
    private static int[][] Pascal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of triangle: ");
        int size = sc.nextInt();
        int[][] pasc = new int[size][size];

        for (int i = 0; i < size; i++) {
            pasc[i][0] = 1;
            pasc[i][i] = 1;

            for (int j = 1; j < i; j++) {
                pasc[i][j] = pasc[i - 1][j - 1] + pasc[i - 1][j];
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%d\t", pasc[i][j]);
            }
            System.out.println();
        }
        return pasc;
    }
}
