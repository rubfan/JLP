package com.hw.hw6;

import org.junit.Test;

/**
 * Created by aa on 3/12/19
 */

public class Task1 {

    // 1) Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….

    private int a = 1000;

    //for
    @Test
    public void test0() {
        for (; a < 10000; a += 3){
            System.out.println(a);
        }
    }

    //while
    @Test
    public void test1() {
        while (a < 10000) {
            System.out.println(a);
            a += 3;
        }
    }

    //do-while
    @Test
    public void test2() {
        do {
            System.out.println(a);
            a += 3;
        }
        while (a < 10000);
    }

}
