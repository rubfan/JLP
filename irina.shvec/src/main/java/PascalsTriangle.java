public class PascalsTriangle {
    //Создайте функцию, которая заполняет 2-мерный массив треугольником Паскаля
    //Pascal triangle
    public static void getPascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        getPascalsTriangle(5);
    }
}
