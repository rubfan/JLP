package com.hw.hw6;

import org.junit.Test;

/**
 * Created by aa on 3/13/19
 */

public class Task6 {

    // 6) Найти минимальный и максимальный элемент массива

    @Test
    public void test0() {

        int[] arr = {1,2,3,4}; // for test

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i != arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println( "Min = " + min + "; Max = " + max);
    }

}
