package LinkedList;

public class MergeTwoSortedLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

        public static void print(Node list1){
            Node temp = list1;

            while(temp != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        } 

        public static Node merge(Node list1 ,Node list2){
            if( list1 == null){
                return list2;
            }
            if(list2 == null){
                return list1;
            }

            if(list1.data <= list2.data){
                list1.next = merge(list1.next, list2);
                return list1;
            }
            else list2.next = merge(list1, list2.next);
            return list2;
        }

        public static void main(String[] args) {
            Node list1 = new Node(1);
            list1.next = new Node(4);
            list1.next.next = new Node(8);
            print(list1);


            Node list2 = new Node(2);
            list2.next = new Node(3);
            list2.next.next = new Node(5);
            print(list2);
     
            Node mrg = merge(list1, list2);
            print(mrg);
            
        }
    
    
}
