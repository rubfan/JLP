public class Fibonacci {

/*
    По соотношению количества входных данных к счетчику прохода по циклам получаем что
    сложность первого алгоритма составляет О(n) а рекурсивного, в свою очередь, O(2^n)
 */

    int counter = 0;
    int counterRecurssive = 0;

    public int fibonacci(Integer n){
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; ++i) {
            int next = a + b;
            a = b;
            b = next;
            counter++;
        }
        return b;
    }

    public int fibonacciRecursive(Integer n)  {
        if(n == 0) {
            counterRecurssive ++;
            return 0;
        }else if(n == 1){
            counterRecurssive ++;
            return 1;
        }else{
            counterRecurssive ++;
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }
}