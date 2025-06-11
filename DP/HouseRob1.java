package DP;

public class HouseRob1 {
    // space optimization tc O(n) sc O(1)

    public static int findMax(int n[]){
        int prev = n[0];
        int prev2= 0;

        for(int i=1;i<n.length;i++){
            int take = n[i];
            if(i>1) take += prev2;
            int nontake = 0+prev;

            int curri= Math.max(take, nontake);
            prev2= prev;
            prev= curri;
        }
        return prev;
    }
    public static void main(String[] args) {
        
        int n[]={1,2,3,1};

        System.out.println("maximumm money rob :"+findMax(n));
    }
    
}
