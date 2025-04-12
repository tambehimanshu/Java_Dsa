package Stack;

import java.util.Stack;

public class ReverseString {
    public static String revString(String str){
        Stack<Character> s = new Stack<>();
        int idx =0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
            
        }
        return result.toString();


    }
    public static void main(String[] args) {
        String str = "fog";
        String result = revString(str);
        System.out.println(result);
    }
    
}
