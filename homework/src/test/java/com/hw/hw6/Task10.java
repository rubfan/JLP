package com.hw.hw6;

import org.junit.Test;
import java.util.Arrays;

/**
 * Created by aa on 3/13/19
 */

public class Task10 {

    // 10) Вывести первые 5 минимальных элементов массива

    @Test
    public void test0() {

        int[] arr = {15,8,3,2,8,7}; // for test

        Arrays.sort(arr);

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

}
