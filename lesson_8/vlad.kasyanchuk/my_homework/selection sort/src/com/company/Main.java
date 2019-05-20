package com.company;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        fillRandomdigits(array);
        long time = System.nanoTime();
        sort(array);
        time = System.nanoTime() - time;
        printArray(array);
        System.out.println(time + " ns");
    }

    public static void fillRandomdigits(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
            System.out.println();
        }
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
        System.out.println();
    }
}
