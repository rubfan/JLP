public class MyLinkedList {
    private Node first;
    private Node last;
    private int size;

    // Конструктор при помощи массива
    MyLinkedList(Object ... arr){
        for (Object i: arr){
            this.add(i);
        }
    }

    public int getSize() {
        return this.size;
    }

    //Добавить элемент
    public void add(Object val){
        if(last == null){
            Node newNode = new Node(null, val, null);
            this.first = newNode;
            this.last = newNode;
            size++;
        }
        else {
            Node newNode = new Node(last, val, null);
            this.last.setNext(newNode);
            this.last = newNode;
            size++;
        }
    }

    //Добавить в начало
    private void addFirst(Object val){
        if(first == null){
            add(val);
        }
        else {
            Node newNode = new Node(null, val, first);
            this.first.setPrev(newNode);
            this.first = newNode;
            size++;
        }
    }

    //Удалить первый элемент
    public void removeFirst(){
        first = first.getNext();
        first.setPrev(null);
        size--;
    }

    //Удалить последний элемент
    public void removeLast(){
        last = last.getPrev();
        last.setNext(null);
        size--;
    }

    //Удалить pos элемент
    public void removePos(int pos){
        if(pos <= 0){
            removeFirst();
        }
        else if(pos >= size - 1){
            removeLast();
        }
        else {
            Node current = find(pos);
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
            current.setPrev(null);
            current.setNext(null);
            size--;
        }
    }

    //Найти элемент по номеру, вернуть значение
    public Object getPos(int pos){
        return find(pos).getValue();
    }

    //Вставить элемент после указанной позиции
    public void insert(Object val, int pos){
        if (pos == 0){
            addFirst(val);
        }
        else if (pos == getSize()){
            add(val);
        }
        else {
            Node current = find(pos);
            Node newN = new Node(current.getPrev(), val, current);
            current.getPrev().setNext(newN);
            current.setPrev(newN);
            size++;
        }
    }

    //Преобразовать в массив
    public Object[] toArray(){
        Object[] obj = new Object[size];
        if(first != null){
            Node current = first;
            int i = 0;
            while(current != null) {
                obj[i++] = current.getValue();
                current = current.getNext();
            }
        }
        return obj;
    }

    //Для печати
    public String toString(){
        String s;
        s = "[";
        if(this.first != null){
            Node current = first;
            boolean trig = false;
            String add;

            while (current != null){

                if(trig) {
                    add =", ";
                }
                else {
                    add = "";
                    trig = true;
                }
                s = s + add + current.getValue();
                current = current.getNext();
            }
        }
        s += "]";
        return s;
    }

    //Найти элемент по значению, вернуть номер позиции
    public int findVal(Object obj){
        Node current = first;
        int pos = 0;
        while(current != null) {
            if (current.getValue() == obj){
                return pos;
            }
            else {
                pos++;
                current = current.getNext();
            }
        }
        pos = -1; //Вернуть -1 если не нашел
        return pos;
    }

    //Найти элемент по номеру
    //Можно было искать двигаясь с начала списка если pos меньше 1/2size,
    //и с конца если больше; Но у меня что-то не получилось:~( (лень разбираться)
    private Node find(int pos){
        Node current = first;
        for (int i = 0; i < pos; i++) {
            current = current.getNext();
        }
        return current;
    }

    private Node getLast(){
        return this.last;
    }
    private Node getFirst(){
        return this.first;
    }
}

