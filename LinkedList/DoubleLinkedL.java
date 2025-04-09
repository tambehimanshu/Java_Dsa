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
public int removefirst(){
    size--;
    if(head == null){
        System.out.println("ddl is empty");
        return Integer.MIN_VALUE;

    }

    //for single node in dddl
    if(size == 1){
        int val = head.data;
        head = null;
        tail = null;
        size=0;

        return val;
    }
    int val = head.data;
    head = head.next; //head move to next Node
    head.prev = null;
    return val;


}
public int removelast(){
    
    if(head == null){
        System.out.println("ddl is mepty");
        return Integer.MAX_VALUE;

    }
    if(size == 1){
        int val = tail.data;
        tail= null;
        head = null;
        size =0;
        return val;
    }
    Node prev = head ;
    for(int i =0; i<size -2;i++){
        prev = prev.next;
    }

    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;

}
    public static void main(String[] args) {
    DoubleLinkedL dll = new DoubleLinkedL();
    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);
    dll.addLast(0);
    dll.print();
    dll.removelast();
    dll.print();
    System.out.println(dll.size);
    }
    
}
