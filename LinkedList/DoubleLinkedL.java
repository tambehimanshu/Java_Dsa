package LinkedList;

public class DoubleLinkedL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public  static int size;

public void addFirst(int data){
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        return;
    }
    
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
}
public void print(){
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data +"->");
        temp = temp.next;
        
    }
    System.out.println("null");
}
public void addLast(int data){
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        return;
    }
    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
}
    public static void main(String[] args) {
    DoubleLinkedL dll = new DoubleLinkedL();
    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);
    dll.addLast(0);
    dll.print();
    System.out.println(dll.size);
    }
    
}
