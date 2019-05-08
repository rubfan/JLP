public class Spiral {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int next = 1;
        int[][] array1 = new int[a][b];
        fillPerimeter(array1, a, b, next);
        fillTheMiddle(array1, a, b, next);
        fillCenter(array1, a, b, next);
        printArray(array1, a, b, next);
    }

    public static void fillPerimeter(int[][] array, int a, int b, int next) {
        for (int x = 0; x < b; x++) {
            array[0][x] = next;
            next++;
        }
        for (int y = 1; y < a; y++) {
            array[y][b - 1] = next;
            next++;
        }
        for (int x = b - 2; x >= 0; x--) {
            array[a - 1][x] = next;
            next++;
        }
        for (int y = a - 2; y > 0; y--) {
            array[y][0] = next;
            next++;
        }
    }

    public static void fillTheMiddle(int[][] array, int a, int b, int next) {
        int c = 1;
        int d = 1;
        while (next < a * b) {
            while (array[c][d + 1] == 0) {
                array[c][d] = next;
                next++;
                d++;
            }
            while (array[c + 1][d] == 0) {
                array[c][d] = next;
                next++;
                c++;
            }
            while (array[c][d - 1] == 0) {
                array[c][d] = next;
                next++;
                d--;
            }
            while (array[c - 1][d] == 0) {
                array[c][d] = next;
                next++;
                c--;
            }
        }
    }

    public static void fillCenter(int[][] array, int a, int b, int next) {
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                if (array[x][y] == 0) {
                    array[x][y] = next;
                }
            }
        }
    }

    public static void printArray(int[][] array, int a, int b, int next) {
        for (int x = 0; x < b; x++) {
            for (int y = 0; y < a; y++) {
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }
    }
}

