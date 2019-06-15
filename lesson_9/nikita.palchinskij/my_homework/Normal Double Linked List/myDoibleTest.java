public class myDoibleTest {
    public static void main(String[] args){
        MyDoubleLinkedList my = new MyDoubleLinkedList();
        my.addl(10);
        my.addl(20);
        my.addl(30);
        my.addf(5);
        my.addf(1);
        my.addf("jnbj");
        my.add(3, 6);
        my.add(4, 100);
        System.out.println(my.showList());
        my.deletef();
        my.deletef();
        my.deletel();
        System.out.println(my.showList());
        System.out.println(my.getSize());
        String[] array = my.toArray();
        System.out.println(array[2] + ", " + array[3]);
        Integer size = array.length;
        for (int i = 0; i < size; i++)
            System.out.print(array[i] + ", ");
        my.addf(23);
        System.out.println(my.showList());
    }
}

