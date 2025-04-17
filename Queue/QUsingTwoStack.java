package Queue;

import java.util.Queue;
import java.util.Stack;

public class QUsingTwoStack {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add tc O(n)
        public static void add(int data){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());  //remove data from s1 and add to s2
            }
            s1.push(data) ;//add new data 
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
                
            }
            
        }
        //remove  tc O(1)
        public static int remove(){
            if (s1.isEmpty()) {
                System.out.println("q is empty");
                return -1;
                
            }
            return s1.pop() ;// remove front element 
        }
 
        // peek tc O(1)
        public static int peek(){
            if (s1.isEmpty()) {
                return -1;
                
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(3);
        q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
    }
    
}
