
import java.util.*;

public class StackWIthAl {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add (data);
        }

        public static int pop (){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
            
        }

        public static int peeek(){
            if(isEmpty()){
                return -1;
            }

            return list.get(list.size()-1);
            
        }

        // public static boolean issEmpty(){
        //     return list.size() == 0;

        // }

        // public static int pp(){
        //     if(issEmpty()){
        //         return -1;
        //     }
        //     int top = list.get(list.size()-1);
        //     list.remove(list.size()-1);
        // }
        // public static void puh(int data){
        //     list.add(data);
        // }

        // public static void peek(){
        //     return list.get(liat.size()-1);
        // }
    }

    public static void main(String[] args) {
        
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peeek());
            s.pop();
            
        }
    }
}
