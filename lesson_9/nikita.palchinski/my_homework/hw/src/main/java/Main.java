public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedl = new MyLinkedList();
        linkedl.add("hello");
        linkedl.add("mylist");
        linkedl.add("mazurok");
        linkedl.showList();
        System.out.println(linkedl.getSize());
        linkedl.remove();
        System.out.println(linkedl.getSize());
        int idx = linkedl.getSize();
        System.out.println(idx);
        System.out.println(linkedl.iSearch(idx - 1));
        linkedl.showList();
        linkedl.add("nsdfkjbl");
        linkedl.add("kdsfh");
        System.out.println(linkedl.getSize());
        linkedl.remove();
        System.out.println(linkedl.getLast());
        linkedl.showList();
        linkedl.remove(1);
        System.out.println(linkedl.getSize());
        linkedl.getLast();
        linkedl.showList();
        linkedl.add("nsdfkaaaaaaaaaajbl");
        linkedl.add("kdsfh");
        linkedl.add("nsdfkjbl");
        linkedl.add("kdsfh");
        linkedl.remove(1);
        linkedl.showList();
        System.out.println(linkedl.getSize());
    }
}