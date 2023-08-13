package org.macro.dataStructures;

public class LinkedList<T> {

    class Node {
        private T data;
        private Node next;

        Node(T data, Node node){
            this.data = data;
            this.next = next;
        }

    }

    private Node head;

    public void add(T data){
        if(head == null){
            Node node = new Node(data,null);
            head = node;
            return;
        }

        Node node = new Node(data,null);
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = node;
    }

    public void printList(){
        Node current = head;
        while(current.next != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print(current.data);
    }

}

class Test{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("hello");
        list.add("world");
        list.add("random");
        list.add("word");

        list.printList();
    }
}
