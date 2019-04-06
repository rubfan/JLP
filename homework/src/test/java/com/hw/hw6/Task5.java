package com.hw.hw6;

import org.junit.Test;

/**
 * Created by aa on 3/13/19
 */

public class Task5 {

    // 5) Найти сумму первых n элементов массива

    @Test
    public void test() {

        int n = 3; // for test
        int[] arr = {1,2,3,4}; // for test

        int sum = 0;

        for (int i = 0; i != n; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
