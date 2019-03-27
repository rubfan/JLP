package com.company;

import java.lang.reflect.Array;

public class MergedArrays {
    public static void main (String[] args){
        int [] a = new int[]{1, 3, 5};
        int [] b = new int [] {2, 4, 8, 9, 12};
        int[] c = new int[a.length + b.length];
        int temp = 0;

        for (int i = 0; i < a.length; i++){
            c[i] = a[i];
            temp++;
        }
        for (int i = 0; i < b.length; i++){
            c[i+temp] = b[i];
        }
        for (int i = 0; i < c.length - 1; i++){
            int min = c[i];
            for (int j = i + 1; j < c.length; j++){
                if (c[j] < c[i] ){
                    int x = c[i];
                    c[i] = c[j];
                    c[j] = x;
                }
            }
        }
                for (int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }

    }
}
