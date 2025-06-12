package LinkedList;

public class ReverseLL {
    static class Node{
        int data;
        Node next;

    
        public Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    public static Node revlist(Node head){
        if(head == null || head.next == null){
            return head;
        }

        // recursive way  Node newNode = revlist(head.next);
        // head.next.next= head;
        // head.next = null;

        // return newNode;

        // optimized way tc O(n) sc O(1)
        Node cur  = head, prev = null , next;

        while(cur!= null){
            next = cur.next;
            cur.next = prev;

            prev = cur;
            cur = next;
    
        }
        return prev;
    }
public static void print(Node head){
    Node temp = head;

    while (temp != null) {
        System.out.print(temp.data+"->");
        temp =temp.next;
        
    }
    System.out.println("null");
}
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next   = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

    System.out.println("original list");
    print(head);

    head = revlist(head);

    System.out.println("rev list");
    print(head);

    }
    
}


