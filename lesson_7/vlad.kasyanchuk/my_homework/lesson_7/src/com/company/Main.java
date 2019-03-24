package com.company;

class Main {

    public static void main(String[] args) {
        //треугольником Паскаля

        int number = 5;
        int[][] array = new int[number][number];
        for (int n = 0; n <= array.length-1; n++) {
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


        //Заполние 2-мерного массива по спирали
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


