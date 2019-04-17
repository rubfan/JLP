public class Spiral {
    public static void main(String[] args) {
    int a = 5;
    int b = 5;
    int next = 1;
    int array1 [][] = new int [a][b];


        for (int x = 0; x < b; x++){
        array1[0][x] = next;
        next ++;
    }
        for (int y = 1; y < a; y++){
        array1[y][b - 1] = next;
        next ++;
    }
        for (int x = b -2; x >= 0; x--){
        array1[a - 1][x] = next;
        next ++;
    }
        for (int y = a - 2; y > 0; y--){
        array1 [y][0] = next;
        next ++;
    }
    int c = 1;
    int d = 1;

        while (next < a * b){
        while (array1 [c][d + 1] == 0){
            array1[c][d] = next;
            next++;
            d++;
        }
        while (array1[c + 1][d] == 0){
            array1[c][d] = next;
            next++;
            c++;
        }
        while (array1[c][d - 1] == 0){
            array1[c][d] = next;
            next++;
            d--;
        }
        while (array1 [c - 1][d] == 0){
            array1[c][d] = next;
            next++;
            c--;
        }
    }
        for (int x = 0; x < a; x++){
        for(int y = 0; y < b; y++){
            if (array1[x][y] == 0){
                array1 [x][y] = next;
            }
        }
    }
        for (int x = 0; x < b; x++) {
        for (int y = 0; y < a; y++){
            System.out.print(array1[x][y] + " ");
        }
        System.out.println("");
    }

}
}
