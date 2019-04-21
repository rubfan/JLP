package com.company;

import java.util.Arrays;

public class SumOfTwoDigits {
    public static void main(String[] args) {
        int[] array = new int[100];
        int sum = 123;
        boolean bool = false;
        fillRandomdigits(array);
        Arrays.sort(array);
        System.out.println();
        checkIfSumexistsInArray(array, sum, bool);
        System.out.println(bool);
    }

    public static void fillRandomdigits(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
    }

    public static void checkIfSumexistsInArray(int[] array, int sum, boolean bool) {
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            for (int j = 0; j < array.length; j++) {
                int b = array[j];
                if (sum == a + b) {
                    bool = true;
                }
            }
        }
    }
}
