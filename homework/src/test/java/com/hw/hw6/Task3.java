package com.hw.hw6;

import org.junit.Test;

/**
 * Created by aa on 3/13/19
 */

public class Task3 {

    // 3) Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….

    private int a = 90;

    @Test
    public void test0() {
        for (; a >= 0; a -= 5) {
            System.out.println(a);
        }
    }

}
