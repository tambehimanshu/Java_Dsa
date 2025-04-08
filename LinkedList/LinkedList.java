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

public void reverse(){ // O(n)
    Node prev = null;
    Node curr= tail = head;

    while (curr != null) {
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr= next;
        
    }
    head = prev;
}

public void deleteNthfromEnd(int n ){
    //size;
    int sz= 0;
    Node temp = head;
    while(temp != null){
        temp =temp.next;
        sz++;
    }
    if(n ==sz){
        head = head.next; //remove first op
        return;

    }
    //size - n;
    //for finding the prev node 

    int i =1;
    int iToFind =sz-n;
    Node prev =head;
    while(i<iToFind){
        prev = prev.next;
        i++;

    }
    //when we find the nth prev node then 
    prev.next = prev.next.next; // means now prev.next will store add of Nth+1 node ;
    return;
}

public Node findMid(Node head){
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null){
        slow = slow.next; // +1
        fast =fast.next.next; //+2;
    }
    return slow; // slow is mid;

}

public boolean checkPalindrom(){
    if(head ==null && head.next == null){
        return true;
    }
    //stp 1 find mid
    Node midNode = findMid(head);
    
    //step 2 - reverse 2nd half;
    Node prev = null;
    Node curr = midNode;
    Node next;
    while (curr != null) {
        next = curr.next;
        curr.next = prev ;
        prev = curr;
        curr =next;
        
    }
    Node right =prev;// head of right half 
    Node left = head; // head of left half 

    //step3 
    while (right != null){
        if(left.data != right.data){
            return false;
        }
        left =left.next;
        right = right.next;
    }
    return true;
}
public static boolean  isCycle(){ // flyod's cycle finding algo 
    Node fast = head;
    Node slow = head;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;

        if(slow ==fast){
            return true;
        }
    }
    return false;
}

public static void removeCycle(){
    //detect cycle 
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while(fast != null && fast.next !=  null){
        slow = slow.next    ;
        fast =fast.next.next;
        if(fast == slow ){
            cycle = true;
            break;
        }

    }
    if(cycle == false){
        return;
    }

    // find meeting point 
    slow = head;
    Node prev =null; //in prev last node will get stored after the loop
    while (slow !=fast) {
        prev =fast;
        
        slow= slow.next;
        fast=fast.next;
        
    }
    prev.next = null;




}

public Node getMid(Node head){
    Node slow = head;
    Node fast  = head.next;

    while (fast!= null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        
    }
    return slow;// mid node
    


}
public Node merge(Node head1,Node head2){
Node mergedLL = new Node(-1);
Node temp = mergedLL;
while (head1 != null && head2!= null) {
if(head1.data <= head2.data){
    temp.next = head1;
    head1 = head1.next;
    temp = temp.next;

}
else{
temp.next = head2;
head2 = head2.next;
temp = temp.next;
}

}

while (head1 != null) {
temp.next = head1;
head1 = head1.next  ;
temp = temp.next;


}
while (head2 != null) {
temp.next = head2;
head2= head2.next;
temp = temp.next;

}
return mergedLL.next;
}

public Node mergeSorrt(Node head){ //O(nlogn)

    //bc 
    if(head == null || head.next == null){
        return head;
    }
    Node mid= getMid(head);
    Node righthead = mid.next;
    mid.next = null;
    Node newLeft = mergeSorrt(head);
    Node newRight =  mergeSorrt(righthead);

    //merge
    return merge(newLeft, newRight);
}

public void zigzag(){
    // find mid
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        
    }

    Node mid = slow;
    // reverse 2nd half\

    Node cur = mid.next;
    mid.next = null;

    Node prev =null;
    Node next ;
    while (cur != null) {
        next = cur.next;
        cur.next = prev ;

        prev = cur;
        cur = next;
        
    }
    Node left = head;
    Node right = prev;
    Node nextl, nextR;

    // 3rd merge - zigag
    while(left != null && right != null){
        nextl= left.next;
        left.next = right;
        nextR = right.next;
        right.next = nextl;

        left = nextl;
        right = nextR;
    }
}

public static void main(String[] args) {

    LinkedList ll = new LinkedList();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addFirst(5);

    ll.print();
    ll.zigzag();
    ll.print();

    // head = new Node(1);

    // Node temp = new Node(2);
    // head.next = temp;
    // head.next.next = new Node(3);
    // head.next.next.next = temp;
    // System.out.println(isCycle());
    // removeCycle();
    // System.out.println(isCycle());
        // LinkedList ll = new LinkedList();
        
        // ll.addFirst(1);
        
        // ll.addFirst(2);
        
        // ll.addFirst(1);
        
        //ll.addLast(3);
        
        //ll.add(1, 9); 
    
      //ll.removefirst();
      //ll.removelast();
        // ll.print();
        // System.out.println(ll.recSearch(2));
        // System.out.println(ll.recSearch(10));
        // System.out.println(size);
        // ll.reverse();
        // ll.print();
    //ll.deleteNthfromEnd(3);
    // System.out.println(ll.checkPalindrom());
      // ll.print();
    }
}
