import java.util.Stack;

public class StackWithLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        static class Stack{
            static Node head;

            public static boolean isEmpty(){
                return head == null;
            }

            // push
            public static void push (int data){
                Node newnode = new Node(data);
                if(isEmpty()){
                    head = newnode;
                    return;

                }
                newnode.next = head;
                head = newnode;
            }

            //pop

            public static int pop (){
                if(isEmpty()){
                    return -1 ;
                }
                int val = head.data;
                head = head.next;
                return val;
            }

            //peek
            public static int peek(){
                if(isEmpty()){
                    return -1;
                }

                int top = head.data;
                return top;
            }


        }
    
    public static void main(String[] args) {
        Stack s =  new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
