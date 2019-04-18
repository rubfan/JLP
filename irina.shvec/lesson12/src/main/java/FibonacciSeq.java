/*Напишите программу, которая выводит n-ый член последовательности Фибоначчи*/

public class FibonacciSeq {
    public static void main(String[] args) {
        System.out.println(getRecursFibonacci(10));
        System.out.println(getUnrecursFibonacci(10));
        System.out.println(functionBine(10));
    }

    public static long getRecursFibonacci(int n) {
        // complexity is O(F(n)) = O(2^n)
        if (n < 2) {
            return n;
        } else if (n < 0) { // if number is negative
            return (long) Math.pow(-1, n + 1) * getRecursFibonacci(n);
        }
        return getRecursFibonacci(n - 1) + getRecursFibonacci(n - 2);
    }

    public static long getUnrecursFibonacci(int n) {
        // complexity is O(F(n)) = O(n)
        int number = 1;
        int previous = 1;

        if (n < 2) {
            return n;
        } else if (n < 0) { // if number is negative
            for (int i = 0; i < n; i--) {
                int temp = number;
                number += previous;
                previous = temp;
            }
        }
        for (int i = 2; i < n; i++) {
            int temp = number;
            number += previous;
            previous = temp;
        }
        return number;
    }

    public static long functionBine(int n) {
        // complexity is O(F(n)) = O(n)
        double phi = 1.618033988749894; //golden ratio
        double psi = -0.618033988749894;
        return Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5));
    }
}
