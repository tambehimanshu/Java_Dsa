package Stack;
import java.util.Stack;

public class LongestvalidParentheses { //tc O(N) sc O(N)
    // This function returns the length of the longest valid parentheses substring
    // in the given string s.
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        stack.push(-1);

        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    max = Math.max(max , i-stack.peek());

                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str ="(()(";
        System.out.println(longestValidParentheses(str));
    }
}
