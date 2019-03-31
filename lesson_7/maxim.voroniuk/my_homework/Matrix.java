import java.util.Random;

public class Matrix {

    public static void main(String[] args) {

        printArr(pascTriangle(9));
        System.out.println();
        printArr(spiralArr(9));
    }

    //Вывод двумерного массива
    private static void printArr(int a[][]) {
        int width = a.length;
        int height = a[0].length;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf("%d\t", a[i][j]);
            }
            System.out.println();
        }
    }

    //1) Создайте функцию, которая заполняет 2-мерный массив треугольником Паскаля
    // (элемент, который на строчке ниже, равен сумме 2х верхних элементов, которые
    // стоят рядом; по бокам стоят единицы)
    private static int[][] pascTriangle(int length) {

        int[][] arr = new int[length][length];

        for (int i = 0; i < length; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;

            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        return arr;
    }

//    2) Заполните 2-мерный массив по спирали:
//    1   2  3 4
//    12 13 14 5
//    11 16 15 6
//    10  9  8 7

    private static int[][] spiralArr(int length) {
        int[][] arr = new int[length][length];
        int next = 1;


        for(int count = length,  max=0; count/2 > 0; count--, max++) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < count; j++) {
                    if (i == 0 && j < count - max) {
                        arr[i + max][j + max] = next++;
                    }
                    if (j != 0) {
                        if (i == 2 && j < count - max) {
                            arr[count - 1][count - (j + 1)] = next++;
                        }
                        if (i == 1 && j < count - max) {
                            arr[j + max][count - 1] = next++;
                        }
                        if (i == 3 && j < count - (max + 1)) {
                            arr[count - (j + 1)][max] = next++;
                        }
                    }
                }
            }
        }
        return arr;
    }
}