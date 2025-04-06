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
public void add(int index, int data){
    if(index == 0){
        addFirst(data);
        return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i =0;

    while(i<index -1){
        temp = temp.next;
        i++;
    }
    // i=i-1

    newNode.next=temp.next;
    temp.next= newNode;
}

public int removefirst(){
    if(size == 0){
        System.out.println(" ll is empty ");
    }
    else if(size == 1){
        int val =head.data;
        head=tail=null;
        size=0;
        return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;

}

public int removelast (){
    if(size ==0){
        System.out.println("emoty ll");

    }
    else if(size ==1){
        int val =tail.data;
        tail =head=null;
        size =0;
        return val;
    }
    // prev = i=size-2;
    Node prev =head;
    for(int i =0;i<size-2;i++){
        prev =prev.next;

    }
    int val = prev.next.data; //taildata
    prev .next = null;
    tail = prev;
    size--;
    return val;
}
public int itrSearch(int key){
    Node temp = head;
    int i =0;

    while (temp != null) {
        if(temp.data == key ){
            return i;
        }
        
            temp =temp.next;
            i++;

        
        
        
    }
    return -1;
}
public int helper(Node head , int key){
    if(head == null){
        return -1;
    }
    if(head.data ==key){
        return 0;
    }

    int idx = helper(head.next, key);
    if(idx ==-1){
        return -1;
    }
    return idx+1;

}

public int recSearch(int key ){
    return helper(head, key);
}
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.addFirst(1);
        
        ll.addFirst(2);
        
        ll.addFirst(3);
        
        ll.addLast(0);
        
        ll.add(1, 9); 
    
      //ll.removefirst();
      //ll.removelast();
        ll.print();
        System.out.println(ll.recSearch(2));
        System.out.println(ll.recSearch(10));
        System.out.println(size);
    
    }
}
