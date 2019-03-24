package com.hw.hw6;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by aa on 3/13/19
 */

public class Task8 {

    // 8) Найти все счастливые билеты от 100000 до 999999 :
    // билет счастливый если сумма первых трех цифр равна сумме трех последних
    // например,  123312: 1+2+3==3+1+2

    @Test
    public void test0() {
        for (int i = 100000; i < 1000000; i++) {

            int n;
            int firstPart = 0;
            int secondPart = 0;

            int ticket = n = i;

            while (n > 999) {
                secondPart = secondPart + n % 10;
                n = n / 10;
            }
            while (n > 0) {
                firstPart = firstPart + n % 10;
                n = n / 10;
            }

            if (firstPart == secondPart) {
                System.out.println(ticket);
            }
        }
    }

}
