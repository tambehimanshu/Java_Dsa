package LinkedList;

public class FirstNodeOfLoopInLL { //tc O(n) sc O(1)
    static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

        public static Node findFirst(Node head){
            Node slow = head , fast = head;

            while(fast!= null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast){
                    slow = head;
                while(slow != fast){
                slow = slow.next;
                fast= fast.next;
                }
                return slow;
            }
        }
            return null;
        }

        public static void main(String[] args) {
            Node head = new Node(1);
            head.next= new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = head.next;

            Node first = findFirst( head);

            if(first == null){
                System.out.println("no cycle present");
            }
            else{
                System.out.println(" cycle start from node "+ first.data);
            }
        }
    
        
    
    
}
