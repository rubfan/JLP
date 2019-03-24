package com.hw.hw6;

import org.junit.Test;

/**
 * Created by aa on 3/13/19
 */

public class Task2 {

    // 2) Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….

    private int a = 1;

    //for
    @Test
    public void test0() {
        for (; a < 112; a += 2) {
            System.out.println(a);
        }
    }

}

