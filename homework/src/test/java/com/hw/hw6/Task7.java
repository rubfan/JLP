package com.hw.hw6;

import org.junit.Test;

/**
 * Created by aa on 3/13/19
 */

public class Task7 {

    // 7) Найти сумму всех четных и сумму всех нечетных элементов массива

    @Test
    public void test() {

        int[] arr = {1,2,3,4}; // for test

        int sumEvenNumber = 0;
        int sumOddNumber = 0;

        for (int i = 0; i != arr.length; i++) {
            if (arr[i] % 2 == 1) {
                sumOddNumber = sumOddNumber + arr[i];
            } else {
                sumEvenNumber = sumEvenNumber + arr[i];
            }
        }
        System.out.println("sumEvenNumber = " + sumEvenNumber + "; sumOddNumber = " + sumOddNumber);
    }

}
