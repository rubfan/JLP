import java.util.Arrays;

public class PascalSpiral {

    public static void main(String[] args) {

        new PascalSpiral().pascal(5);
        new PascalSpiral().spiral(4);
    }

    void pascal(int a){
        int[][] arr = new int[a][2*a+1];
        arr[0][a]=1;
        System.out.println(Arrays.toString(arr[0]));
        for(int i=1; i<arr.length; i++){
            for(int j=1; j<arr[i].length-1; j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j+1];
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
    }


    /*
    метод условно делится на три части. в первой мы заполняем массив по периметру. во второй - двигаясь от координаты
    arr[1][1] проверяем не является ли текущий элемент массива ==0 так как массив по умолчанию заполняется нулями.
    если да - заполняем ячейку значением value и инкрементируем его. если нет - меняем направление перебора по часовой
    стрелке. последний элемент заполняется путем перебора всего массива и выявления последней ячейки со значением 0.
     */

    void spiral(int a){
        int[][] arr = new int[a][a];
        int value=1;

        for (int y = 0; y < a; y++) {
            arr[0][y] = value;
            value++;
        }
        for (int x = 1; x < a; x++) {
            arr[x][a - 1] = value;
            value++;
        }
        for (int y = a - 2; y >= 0; y--) {
            arr[a - 1][y] = value;
            value++;
        }
        for (int x = a - 2; x > 0; x--) {
            arr[x][0] = value;
            value++;
        }


            int row=1;
            int column=1;

        while (value < (int)Math.pow(a, 2)) {

            while (arr[row][column + 1] == 0) {
                arr[row][column] = value;
                value++;
                column++;
            }

            while (arr[row + 1][column] == 0) {
                arr[row][column] = value;
                value++;
                row++;
            }

            while (arr[row][column - 1] == 0) {
                arr[row][column] = value;
                value++;
                column--;
            }

            while (arr[row - 1][column] == 0) {
                arr[row][column] = value;
                value++;
                row--;
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = value;
                }
            }
        }

        System.out.println(Arrays.deepToString(arr).replace("], ", "]\n"));

    }
}
