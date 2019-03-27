package com.hw.hw6;

import org.junit.Test;

/**
 * Created by aa on 3/14/19
 */

public class Task11 {

    // 11) Write  a program to repeatedly add all the digits until the result has only one digit of a given non-negative number:
    // The digital root of 555555 = 5 + 5 + 5 + 5 + 5 + 5 = 30 = 3 + 0 = 3

    private int n = 555555; // for test

    @Test
    public void test() {

        while (n > 9) {
            int sum = 0;

            while (n / 10 > 0) {
                sum = sum + n % 10;
                n = n / 10;
            }
            n = sum + n;
        }
        System.out.println(n);

    }
}
