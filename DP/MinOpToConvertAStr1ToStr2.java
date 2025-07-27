package DP;

public class MinOpToConvertAStr1ToStr2 {
    public static int findLcs(String text1,String text2){
         int n = text1.length();
        int m = text2.length();

        int prev []= new int [m+1];
        int curr []= new int[m+1];
        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    curr[j] =1+prev[j-1];
                }
                else{
                    curr[j]= Math.max(prev[j],curr[j-1]);
                }
            }
            prev = (int[])(curr.clone());
        }
        return prev[m];
    
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2= "anc";

        int n = s1.length();
        int m = s2.length();

        int lcs = findLcs(s1, s2);

        int minOp = (n+m)-2 * lcs;
        System.out.println("min op req to convert s1 to s2 is : "+minOp);
    }
}
