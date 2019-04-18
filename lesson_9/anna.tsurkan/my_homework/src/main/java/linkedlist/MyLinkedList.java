package linkedlist;
import java.lang.reflect.Array;
import java.util.Arrays;


public class MyLinkedList {
        private  Node first;
        private  Node last;
        private int size = 0;
        Node[] list;
        Node node = new Node();


        public Node[] transform(int[] array) {
        list = new Node[array.length];
            first = new Node();
            last = new Node();
            int i = 0;
            do {
                first.setElement(array[i]);
                first.setPrev(last);
                Node nextNode = new Node();
                first.setNext(nextNode);
                nextNode.setElement(array[i++]);
                nextNode.setPrev(first);
                nextNode.setNext(last);
                list[size] = first;
                size++;
                last = first;
                first = nextNode;
            } while (last != null && i < array.length);
            return list;
        }

        public void addElement(int newElement) {
            node.setElement(newElement);
            Node[] list2 = Arrays.copyOf(list, list.length + 1);
            list2[list2.length - 1] = node;
            node.setNext(null);
            node.setPrev(list2[list.length]);
            list = list2;
        }

        public void deleteElement() {
            Node[] list3 = Arrays.copyOf(list, list.length );
            node = list3[list.length-3];
            node.setPrev(last);
            last.setNext(null);
            list = list3;
        }


        public void findIndexOfElement(int elementToFind){
            node.setElement(elementToFind);
            for (int i = 0; i < list.length; i++) {
                if (list[i].getElement()== node.getElement()){
                    System.out.println("Index " + i);
                }
                break;
            }
        }


        public void show() {
            for (Node node : list) {
                System.out.print(node.getElement() + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            MyLinkedList myLinkedList = new MyLinkedList();
            int[] example = {-3, 4, 1, 1, 1};
            myLinkedList.transform(example);
            myLinkedList.show();
            myLinkedList.addElement(4);
            myLinkedList.show();
            myLinkedList.deleteElement();
            myLinkedList.show();
            myLinkedList.findIndexOfElement(4);


        }

    }

