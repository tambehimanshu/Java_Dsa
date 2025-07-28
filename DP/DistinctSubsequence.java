package DP;


public class DistinctSubsequence { // we need to find the max no of s2 can form from s1 tc O(n*m) sc O(n)
    public static int findMax(String s1 , String s2){
        int n = s1.length();
        int m = s2.length();

        int prev[]= new int[m+1];
         prev[0]= 1; // base case

         for(int i =1;i<=n;i++){
            for(int j=m;j>=1;j--){ // dosent matter we start from start or end but for space optimization we take from last
              if(s1.charAt(i-1) == s2.charAt(j-1)){
                prev[j]= prev[j-1]+ prev[j];
              }
            }
         }
         return prev[m];
    }
    public static void main(String[] args) {
        String s1 = "babgbag";
    String s2 = "bag";

    int res = findMax(s1,s2); 
    System.out.println( "maximum no of occurance of s2 in s1 is: "+res);
    }
    
    
}
