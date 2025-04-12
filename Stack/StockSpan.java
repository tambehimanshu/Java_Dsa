package Stack;

import java.util.Stack;

public class StockSpan {
    public static void stockss(int stocks[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0]=1;
        s.push(0); // here we add the index in the stack
        
        for(int i =1;i<stocks.length;i++){
            int currPrice = stocks[i];
            while (!s.isEmpty() && currPrice >stocks[s.peek()]) {
                //remove small size elements

                s.pop();
                
            }
            if(s.isEmpty()){
                span[i]= i+1;
            }
            else{
                int prevHigh = s.peek(); // 0 index is peek and that is stored in prevhigh
                span[i] = i-prevHigh;   // for i =1 span[i] = 1- prevhigh(0)
            } 
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[]= {100,80,60,70,50,85,100};
        int span[]= new int [stocks.length];
        stockss(stocks,span);

        for(int i =0;i<span.length;i++){
            System.out.println(span[i]);
        }
    }
    
}

