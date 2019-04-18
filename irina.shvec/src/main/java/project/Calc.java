package project;
/*Сделать проект состоящий из 2х классов в первом классе App находиться метод
 main который вызывает методы класса Calc вычисляя какое либо выражение и результат
  выводит на экран, во втором классе Calc находиться 4 метода public long add(int a, int b){..},
   public long sub(int a, int b){..}, public long div(int a, int b){..}, public long mil(int a, int b){..},
    которые соответственно делают основные операции простого калькулятора. Задача: написать Maven проект в
     котом все методы класса Calc будут покрыты юнит тестами.*/

public class Calc {
    public static long add(int a, int b){
        return a + b;
    }

    public static long sub(int a, int b){
        return a - b;
    }

    public static long div(int a, int b){
        return a / b;
    }

    public static long mul(int a, int b){
        return a * b;
    }
}

