import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
public class MinOfMaxOfEveryWindowSize {
    public ArrayList<Integer> maxOfMins(int[] arr) { // tc O(n) sc O(n)
        // Your code here
        int  n = arr.length;
       int[] left = new int[n];
       int[]right = new int[n];
       Arrays.fill(left,-1);
       Arrays.fill(right,n);
       
       Deque<Integer> stack = new ArrayDeque<>();
        for(int i =0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
               stack.pop();
            }if(!stack.isEmpty()){
                left[i]=stack.peek();
            }
            
            stack.push(i);
        }
        stack.clear();
        
      for(int i=n-1;i>=0;i--){
          while(!stack.isEmpty()&&arr[stack.peek()]>= arr[i]){
              stack.pop();
          }
          if(!stack.isEmpty()){
              right[i]=stack.peek();
          }
          stack.push(i);
      }
      int []res = new int [n+1];
      Arrays.fill(res,0);
      for(int i =0;i<n;i++){
          int windowSize= right[i]- left[i]-1;
          res[windowSize] = Math.max(res[windowSize],arr[i]);
          
      }
      for(int i =n-1;i>=1;i--){
          res[i]=Math.max(res[i],res[i+1]);
      }
      ArrayList<Integer>ans = new ArrayList<>();
      for(int i=1;i<=n;i++){
          ans.add(res[i]);
      }
      return ans;
    }
    public static void main(String[] args) {
        MinOfMaxOfEveryWindowSize obj = new MinOfMaxOfEveryWindowSize();
        int[] arr = {6,2,5,4,5,1,6};
        ArrayList <Integer> ans = obj.maxOfMins(arr);
        System.out.println(ans);
    }

}
