import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        int NumTask;

        Scanner in = new Scanner(System.in);
        HomeWork7 hw = new HomeWork7();

        System.out.println("Enter the number of Task from 1 to 2:");
        NumTask = in.nextInt();

        switch (NumTask) {
            case 1:
                hw.Task_1();
                break;
            case 2:
                hw.Task_2();
                break;
            default:
                System.out.println("From 1 to 2");
                break;
        }
    }

    private void Task_1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of triangle levels: ");
        int TriangleLevels = sc.nextInt();
        int[][] array = new int[TriangleLevels][TriangleLevels];

        for (int i = 0; i < TriangleLevels; i++) {
            array[i][0] = 1;
            array[i][i] = 1;

            for (int j = 1; j < i; j++) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
            }
        }
        for (int i = 0; i < TriangleLevels; i++) {
            for (int j = 0; j < TriangleLevels; j++) {
                System.out.printf("%d\t", array[i][j]);
            }
            System.out.println();
        }
    }

    private void Task_2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of spiral: ");
        int size = sc.nextInt();
//        System.out.println("Enter the initial value: ");
//        int value = sc.nextInt();
        int[][] spiral = new int[size][size];

        int row = 0;
        int col = 0;
        int dx = 1;
        int dy = 0;
        int dirChanges = 0;
        int visits = size;

        for (int i = 0; i < size * size; i++) {
            spiral[row][col] = i + 1;
            if (--visits == 0) {
                visits = size * (dirChanges % 2) + size * ((dirChanges + 1) % 2) - (dirChanges / 2 - 1) - 2;
                int temp = dx;
                dx = -dy;
                dy = temp;
                dirChanges++;
            }
            col += dx;
            row += dy;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(spiral[i][j] + "\t");
                System.out.println();
        }
    }
}


