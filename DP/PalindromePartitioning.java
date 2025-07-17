public class PalindromePartitioning {
     static boolean isPalindrome(int i,int j,String s){
        while(i<j){
            if(s.charAt(i) !=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public  static int minCut(String s) {
        int n =s.length();
        int[] dp = new int[n+1];
        dp[n]=0;
        for(int i =n-1;i>=0;i--){
            int minCost=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(isPalindrome(i,j,s)){
                    int cost =1+dp[j+1];
                    minCost =Math.min(minCost,cost);
                }
            }
            dp[i]=minCost;
        }
        return dp[0]-1;
    }
    public static void main(String[] args) {
        String s = "BABABCBADCEDE";
        int partitons = minCut(s);
        System.out.println("min no of partitions : "+partitons);
    }
}
