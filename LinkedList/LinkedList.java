package LinkedList;

public class LinkedList {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data ){
            this.data=data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head =tail=newnode ;// for single node
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail= newNode;
    }
// print ll
    public void print(){
        if (head==null) {
            System.out.println("ll is empty");
            return;
            
        }
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data+"->");
            temp = temp.next;   
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addLast(0);
        ll.print();
    
    }
}
