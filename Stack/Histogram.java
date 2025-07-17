package Stack;  // tc O(n)  sc O(n)

import java.util.Stack;

public class Histogram {

    public static void maxArea(int arr[]){
        int n = arr.length;
     int area = 0;
     int nsl[]= new int[arr.length];
     int nsr []= new int[arr.length];
        //next smaleer left 

        Stack<Integer> sm = new Stack<>();
        for(int i =0;i<n;i++){
            while (!sm.isEmpty() && arr[sm.peek()] >= arr[i]) {
                sm.pop();
                
            }
            if(sm.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]= sm.peek();

            }
            sm.push(i);
        }
      // next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i = n-1;i>=0;i--){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
                
            }
            if(s.isEmpty()){
                nsr[i]= arr.length; // n
            }
            else{
                nsr[i]= s.peek();

            }
            s.push(i);
        }

        //width calcutation w= j=i-1
        //j = nsr i =nsl
        for(int i =0;i<n;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i]-1; //j-i-1
            int currArea = height * width;
            area= Math.max(currArea, area);
        }
        System.out.println("max area is :"+area);

    }
    public static void main(String[] args) {
        int arr []= {2,1,5,6,2,3}; //height 
     maxArea(arr);

    }
    
}
