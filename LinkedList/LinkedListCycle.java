package LinkedList;


public class LinkedListCycle { // tc O(n) sc O(1)

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next= null;            
        }
    }
    public static boolean detectLoop(Node head){
        if(head == null){
            return false;
        }
        Node slow = head , fast = head;

        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(4);

    //loop
    head.next.next.next =null;

    if(detectLoop(head))
    System.out.println("true");
    else
    System.out.println("false");
    }
    
}
