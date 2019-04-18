public class Node {
    Node prev;
    Object value;
    Node next;


    Node(Node p, Object v, Node n){
        this.value = v;
        this.prev = p;
        this.next = n;
    }

    public Node getPrev(){
        return this.prev;
    }

    public Node getNext(){
        return this.next;
    }

    public Object getValue() {
        return value;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
