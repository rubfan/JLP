import java.util.Arrays;

public class Task4 {

    //4) Написать класс MyLinkedList в котором будет находиться алгоритм преобразования масива
    // в структуру линкед-лист - без использования Collection API
    // 5) Добавить в самописный Linked List метод добавления элемента
    // 6) Добавить метод удаления элемента
    // 7) Добавить метод вставки элемента по индексу
    // 8) Добавить поиск элемента
    // 9) Добавить метод преобразования в из листа в обычный Array

    public static void main(String[] args) {

        Integer[] arr = {0,1,2,3,4,5,6,7,8,9};
        // 4)Преобразовывает!
        MyLinkedList m = new MyLinkedList(arr);
        //Выводит!
        System.out.println(m);

        // 5)Добавляет!
        m.add("Hello");
        m.add("world!");
        System.out.println(m);

        // 6)Удаляет!
        m.removeLast();
        m.removeFirst();
        System.out.println(m);
        //Удаляет по индексу
        m.removePos(9);
        System.out.println(m);

        // 7)Вставка по индексу
        m.insert("X", 5);
        System.out.println(m);

        // 8) Поиск элемента (по индексу)
        System.out.println("Element on pos 5:\t" + m.getPos(5));
        // 8) Поиск элемента (по значению)
        System.out.println("№ of 'X' element:\t" + m.findVal("X"));

        // 9) Преоборазовывает
        Object[] obj = m.toArray();
        System.out.println(Arrays.toString(obj));
    }
}
