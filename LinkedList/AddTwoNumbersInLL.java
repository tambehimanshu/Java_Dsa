package LinkedList;

public class AddTwoNumbersInLL { // tc O(m+n) sc O(1)


static class Node {
    int data;
    Node next;

    public Node(int val) {
        data = val;
        next = null;
    }
}



  
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    public static int countNodes(Node head) {
        int len = 0;
        Node curr = head;

        while (curr != null) {
            len += 1;
            curr = curr.next;
        }
        return len;
    }


     public static Node trimLeadingZeros(Node head) {
        while (head != null && head.data == 0) {
            head = head.next;
        }
        return head;
    }
  
   
    public static Node addTwoLists(Node num1, Node num2) {
		num1 = trimLeadingZeros(num1);
		num2 = trimLeadingZeros(num2);
      
  
        int len1 = countNodes(num1);
        int len2 = countNodes(num2);

       
        if (len1 < len2) {
            return addTwoLists(num2, num1);
        }

        int carry = 0;
        num1 = reverse(num1);
        num2 = reverse(num2);

        Node res = num1;

       
        while (num1!=null ||num2 != null || carry != 0) {

      
            num1.data += carry;

            
            if (num2 != null) {
                num1.data += num2.data;
                num2 = num2.next;
            }

     
            carry = num1.data / 10;

            
            num1.data = num1.data % 10;

          
            if (num1.next == null && carry != 0) {
                num1.next =new Node(0);
            }

            num1 = num1.next;
        }

        return reverse(res);
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
  
        Node num1 = new Node(1);
        num1.next = new Node(2);
        num1.next.next = new Node(3);

        
        Node num2 = new Node(9);
        num2.next = new Node(9);
        num2.next.next = new Node(9);

        Node sum = addTwoLists(num1, num2);
        printList(sum);
    }
}

