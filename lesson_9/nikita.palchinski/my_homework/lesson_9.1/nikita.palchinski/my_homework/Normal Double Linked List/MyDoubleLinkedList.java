public class MyDoubleLinkedList implements  MyDoubleList{
    class Node {
        Node next;
        Node prev;
        Object data;
        Node(Object data){
            this.data = data;
        }
    }
    Node tail, head;
    int size;
    public void addl(Object data) {
        Node tmp = new Node(data);
        if (tail == null)
        {
            tail = tmp;
            head = tmp;
            size++;
        }
        else
        {
            tail.next = tmp;
            tmp.prev = tail;
            tail = tmp;
            size++;
        }
    }
    public void addf(Object data) {
        Node tmp = new Node(data);
        if (head == null) {
            tail = tmp;
            head = tmp;
            size++;
        }
        else
        {
            head.prev = tmp;
            tmp.next = head;
            head = tmp;
            size++;
        }
    }
    public void deletef(){
        if(head != null)
        {
            Node tmp = head;
            head = tmp.next;
            tmp.prev = null;
            size--;
        }
    }
    public void deletel(){
        if(tail != null){
            Node tmp = tail;
            tail = tmp.prev;
            tmp.next = null;
            size--;
        }
    }
    public void delete(int index){
        if(index == 0)
        {
            deletef();
        }
        if (index == size)
        {
            deletel();
        }
        if(index>0 && index<size)
        {
            Node tmp = head;
            for (int i = 0;i < index; i++){
                tmp.next = tmp;
            }
            tmp.next.prev = tmp.prev;
            tmp.prev.next = tmp.next;
            size--;
        }
    }
    public void add(int index, Object data){
        Node tmp = new Node(data);
        if(index == 0){
            addf(data);
        }
        if(index == size){
            addl(data);
        }
        if(index > 0 && index < size){
            Node x = head;
            for (int i = 1;i < index; i++){
                x = x.next;
            }
            tmp.next = x.next;
            tmp.prev = x;
            x.next = tmp;
            size++;
        }
    }
    public int getSize(){
        return size;
    }
    public String showList(){
        if(head == null){
            return null;
        }
        Node tmp = head;
        //System.out.println("gg");
        String tmpString = tmp.data.toString();
        while (tmp != tail)
        {
            tmp = tmp.next;
            tmpString = tmpString.concat(", \n" + tmp.data.toString());
        }
        tmpString = tmpString.concat(".\n");
            return tmpString;
        }

    public Object getFirst() {
        return head.data;
    }

    public Object getLast() {
        return tail.data;
    }

    public String[] toArray(){
        if(head == null){
            return null;
        }
        Node tmp = head;
        String[] array = new String[this.size];
        String tmpString = tmp.data.toString();
        array[0] = tmpString;
        int i = 1;
        while (tmp != tail)
        {
            tmp = tmp.next;
            array[i] = tmp.data.toString();
            i++;
        }
        return array;
    }

    /*public Object[] transform() {
        int zise = this.size;
        Object[] array = new Object[zise];
        for(int i = 0; i < zise; i++)
        {
            array[i] = getFirst();
            deletef();
        }
        return array;
    }*/
}
