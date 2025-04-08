package LinkedList;

public class MergeWithLL {
    public class Node{
        Node node;
        int next;

        public Node(int data){
            this.node = data;
            this.next = null;        }
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

    public Node mergeSorrt(Node head){

        //bc 
        if(head == null || head.next == null){
            return head;
        }
        Node mid= getMid();
        Node righthead = mid.next;
        mid.next = null;
        Node newLeft = mergeSorrt(head);
        Node newRight =  mergeSorrt(righthead);

        //merge
        return merge(newLeft, newRight);
    }


    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
    }
    
}
