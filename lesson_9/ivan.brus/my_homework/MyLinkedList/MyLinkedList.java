import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T> {

    private Node first;
    private Node last;
    int size=0;

    public Iterator<T> iterator() { return new LinkedListIterator(); }

    private class LinkedListIterator implements Iterator<T> {
        private Node current = first;

        public T next() {
            if (!hasNext()) { throw new NoSuchElementException(); }
            T item = current.data;
            current = current.next;
            return item;
        }

        public boolean hasNext() { return current != null; }

        public void remove() { throw new UnsupportedOperationException(); }
    }


    private class Node {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void arrayToList(T[] arr){

        for(int i=0; i<arr.length; i++){
            this.add(arr[i]);
        }
    }

    public int[] listToArray(MyLinkedList<T> list){
        int[] arr = new int[list.size];
        Node current = first;
        for(int i=0; i< list.size; i++){
            arr[i] = (int)current.data;
            current = current.next;
        }
        return arr;
    }

    public void add(T item) {
        if (item == null) { throw new NullPointerException(); }
        if (size != 0) {
            Node prev = last;
            last = new Node(item, null);
            prev.next = last;
        }
        else {
            last = new Node(item, null);
            first = last;
        }
        size++;
    }

    public void replase(T item, int position){
        Node current = first;
        int i = 0;
        while(i != position){
            current = current.next;
            i++;
        }
        current.data = item;
    }

    public boolean remove(T item) {
        if (size == 0) { throw new IllegalStateException(); }
        boolean result = false;
        Node prev = first;
        Node curr = first;
        while (curr.next != null || curr == last) {
            if (curr.data.equals(item)) {
                if (size == 1) { first = null; last = null; }
                else if (curr.equals(first)) { first = first.next; }
                else if (curr.equals(last)) { last = prev; last.next = null; }
                else { prev.next = curr.next; }
                size--;
                result = true;
                break;
            }
            prev = curr;
            curr = prev.next;
        }
        return result;
    }

    public void search(T item){
        Node current = first;
        int i = 0;
        while(current.data != item){
            current = current.next;
            i++;
        }
        System.out.println("Your item is at " + i + "th position");
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (T item : this)
            s.append(item + " ");
        return s.toString();
    }

    public static void main(String[] args) {
        Integer[] arr = {3,5,12,16,28,19,0,35,74,53};
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.arrayToList(arr);
        System.out.println(list.toString());
        list.add(12);
        System.out.println(list.toString());
        list.remove(0);
        list.replase(1985, 3);
        list.search(5);
        System.out.println(Arrays.toString(list.listToArray(list)));
    }

}
