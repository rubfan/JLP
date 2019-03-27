package com.company;

import java.util.Arrays;

public class SumOfTwoDigits {
    public static void main (String[] args){
    int [] array = new int [100];
    int sum = 123;
    boolean bool = false;
	for (int i = 0; i < array.length; i++){
        array[i] = (int)(Math.random()*100);
        System.out.print(array[i] + " ");
        }
        Arrays.sort(array);
        System.out.println("");
        for (int i = 0; i < array.length; i++){
	    int a = array[i];
	    for (int j = 0; j < array.length; j++){
	        int b = array[j];
	        if (sum == a + b){
	            bool = true;
	           }
        }
    }
        System.out.println(bool);
}
}
