package com.company;

public class MergedArrays {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5};
        int[] b = new int[]{2, 4, 8, 9, 12};
        int[] c = new int[a.length + b.length];
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            temp++;
        }
        for (int i = 0; i < b.length; i++) {
            c[i + temp] = b[i];
        }
        sort(c);
        printArray(c);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
