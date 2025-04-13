package Stack;

import java.util.Stack;

public class NextGreaterElement {

    public static void nextGreaterE(int arr[],int nextG[]){
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        
        
        

        for(int i =n-1;i>=0;i--){
            while (!s.isEmpty() && arr[s.peek()]< arr[i] ) {  // step 1 : if we dont find greater then curretn then we will pop small elements from the stack
                s.pop();
                
            }
            if(s.isEmpty()){ // after poping if we find that stack is empty then our current element we get -1
            nextG[i]=-1;
            }
            else {
                nextG[i]= arr[s.peek()]; // after poping the stack is still not empty means nextgreater is the top of stack so peek that 
            }
            s.push(i) ;// at last push that i in stack and move forward for next eleemt
        }

        for(int i =0;i<nextG.length;i++){
            System.out.print(nextG[i]+ " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[]={7,5,9,8,2,4};

        int nextG[] = new int[arr.length];
        
        nextGreaterE(arr,nextG);
    }
}
//tc O(n)

//sc O(n)


//form of questins of this type
//1. nextG from left side then only change the loop from start to end
// 2 find next smallest (int that instrread of poping smallest elemet pop the largest element )
//3.next smaller left reverse the loop 