package Stack;

import java.util.Stack;

public class RevStack {

    public static void PushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        PushAtBottom(s,data);
        s.push(top);
    }
    public static void prt(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
            
        }
    }
    public static void rev(Stack<Integer> s ){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        rev(s);
        PushAtBottom(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
    

        rev(s);
        prt(s);
    }
    
} 
// tc O(n^2)
// sc O(n)
