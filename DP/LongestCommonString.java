class dp{
    public static int findlcs(String s1, String s2){
        int n = s1.length() ;
        int m = s2.length();

        int dp[][] = new int [n+1][m+1];
        int sum =0;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                 dp[i][j] = 1+ dp[i-1][j-1];
                 sum = Math.max(sum, dp[i][j]);
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String s1= "abcde";
        String s2 = "abcds";

        System.out.println(findlcs(s1,s2));
    }
}