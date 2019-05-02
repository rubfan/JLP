package linkedList;

public class MyLinkedList {
    private int size;
    private Node head;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean add(Object data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node node = head;
            for ( ; node.next != null; node = node.next) {}
            node.next = new Node(data);
        }
        size++;
        return true;
    }

    public int indexOf(Object target) {
        Node node = head;
        for (int i = 0; i < size; i++){
            if (equals(target, node.data)) {
                return i;
            }
            node = node.next;
        }
        return -1;
    }
    private boolean equals (Object target, Object data) {
        if (target == null){
            return data == null;
        } else {
            return target.equals(data);
        }
    }

    public void add (int index, Object data) {
        if (index == 0) {
            head = new Node(data, head);
        } else {
            Node node = getNode(index - 1);
            node.next = new Node( data, node.next);
        }
        size++;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public boolean remove (Object obj) {
        getNode(indexOf(obj));
        if (indexOf(obj) == 0) {
            head = head.next;
        } else {
            Node node = getNode(indexOf(obj)-1);
            node.next = node.next.next;
        }
        size--;
        return true;
    }
    public Object[] toArray() {
        Object[] array = new Object[size];
        int i = 0;
        for (Node node=head; node != null; node = node.next) {
            // System.out.println(node);
            array[i] = node.data;
            i++;
        }
        return array;
    }




}
