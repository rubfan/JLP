package com.hw.hw6;

import org.junit.Test;

/**
 * Created by aa on 3/13/19
 */

public class Task4 {

    // 4) Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

    private int a = 2;

    @Test
    public void test0() {

        for (; a <= Math.pow(2, 20); a *= 2) {
            System.out.println(a);
        }
    }
}
