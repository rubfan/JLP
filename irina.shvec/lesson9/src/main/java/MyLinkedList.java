
/*Написать класс MyLinkedList в котором будет находиться алгоритм преобразования масива в структуру линкед-лист
 - без использования Collection API:
        - Добавить в самописный Linked List метод добавления элемента
        - Добавить метод удаления элемента
        - Добавить метод вставки элемента по индексу
        - Добавить поиск элемента
        - Добавить метод преобразования в из листа в обычный Array*/


import java.lang.reflect.Array;
import java.util.Arrays;

public class MyLinkedList {
    private static Node first;
    private static Node last;
    private int size = 0;
    private Node[] list;
    Node node = new Node();


    public void fillLink(int[] arr) {
        list = new Node[arr.length];
        first = new Node();
        last = new Node();
        int i = 0;
        do {
            first.var = arr[i];
            first.prev = last;
            Node nextNode = new Node();
            first.next = nextNode;
            nextNode.var = arr[i++];
            nextNode.prev = first;
            nextNode.next = last;
            list[size] = first;
            size++;
            last = first;
            first = nextNode;
        } while (last != null && i <= arr.length - 1);
    }

    public void insert(int data) {
        node.var = data;
        Node[] tempList = Arrays.copyOf(list, list.length + 1);
        tempList[tempList.length - 1] = node;
        node.next = null;
        node.prev = tempList[list.length];
        list = tempList;
    }

    public void delete() {
        Node[] tempList = Arrays.copyOf(list, list.length - 1);
        node = list[list.length];
        node.prev = last;
        last.next = null;
        list = tempList;
    }


    public void insertAt(int index, int data) {
        node.var = data;
        node.prev = list[index - 1];
        node.next = list[index + 1];
        if (index == 0) {
            Node[] newList = new Node[list.length + 1];
            newList[0] = node;
            for (int i = 1; i < newList.length - 1; i++) {
                newList[i] = list[i - 1];
            }
            list = newList;
        } else if (index > 0 && index < list.length) {
            Node[] arr1 = Arrays.copyOfRange(list, 0, index);
            Node[] arr2 = new Node[list.length - index + 1];
            arr2[0] = node;
            for (int i = index, j = 1; i < list.length; i++, j++) {
                Arrays.fill(arr2, j, arr2.length, list[i]);
            }
            list = (Node[]) Array.newInstance(arr1.getClass().getComponentType(), arr1.length + arr2.length);
            System.arraycopy(arr1, 0, list, 0, arr1.length);
            System.arraycopy(arr2, 0, list, arr1.length, arr2.length);
        } else {
            System.out.println("Index out of array's bonds");
        }
    }

    public void findElement(int data){
        node.var = data;
        for (int i = 0; i < list.length; i++) {
            if (list[i].var == node.var){
                System.out.println("Index of destination element is " + i);
            }break;
        }
    }
    public void reverseToArr(){
        int[]arr = new int[list.length];
        System.out.println("Array from list: ");
        for (int i = 0; i < list.length; i++) {
            arr[i] = list[i].var;
            System.out.print(arr[i] + " ");
        }
    }

    public void show() {
        for (Node node : list) {
            System.out.print(node.var + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        int[] a = {1, 2, 3, 4, 5};
        myLinkedList.fillLink(a);
        myLinkedList.show();
        myLinkedList.insertAt(2, 5);
        myLinkedList.show();
        myLinkedList.reverseToArr();


    }

}

