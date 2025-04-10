package LinkedList;

import java.util.HashSet;

public class RemovelOfDuplicate {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static Node removedup(Node head){
        if(head == null){
            return null;
        }

        HashSet<Integer> seen = new HashSet<>();
        Node curr = head;
        Node prev = null;

        while(curr != null){
            if(seen.contains(curr.data)){
                prev.next = curr.next;
            }else {
                seen.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
     public static void print(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("Null");
     }

     public static Node opti(Node head){  // tc O(n)  sc O(1)
        if(head == null){
            return null;
        }

        Node curr = head;

        while (curr != null) {
            Node runner = curr;

            while(runner.next != null){
                if(runner.next.data == curr.data){
                    runner.next = runner.next.next; // skiping the duplicate node
                }else {
                    runner= runner.next; // runner +1
                }
            }
            curr= curr.next; // curr +1
            
        }
        return head;
     }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next= new Node(4);
        head.next.next.next .next = new Node(4);

        print(head);

        head = opti(head);

        print(head);
    }
    
} //tc O(n)
//sp O(n)
