package Greedy;
import java.util.*;

public class CoinChainCode {
    public static void main(String[] args) {
        Integer coin[]={1,2,5,10,20,50,100,200,500,2000};
        int count =0;

        int amount = 590;
        int currAmount = 0;
        Arrays.sort(coin , Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<coin.length;i++ ){
            if(coin[i]<=amount){
                while (coin[i]<=amount) {
                    count++;
                    ans.add(coin[i]);
                    amount = amount-coin[i];
                    
                }
            }
        }

        System.out.println("count "+count);
        for(int i =0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
        System.out.println();


        
    }
    
}
