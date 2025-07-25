public class LcsprintlcsString { // tc O(n*m) scO(n*m)
 
    
    public static String printStr(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
       

        int dp[][]= new int [n+1][m+1];

    for(int i =1;i<=n;i++){
        for(int j =1;j<=m;j++){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                dp[i][j]= 1+dp[i-1][j-1];
            }
            else{
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
    }
  
    int i=n;
    int j=m;

    StringBuilder ans =new StringBuilder();

    while(i>0 && j>0){
    if(s1.charAt(i-1)== s2.charAt(j-1)){
        ans.append(s1.charAt(i-1));
        i--;
        j--;
    }else if (dp[i][j-1]>dp[i-1][j]){
            j--;
        }
        else{
            i--;
        }
    }

    return ans.reverse().toString();

    }
    public static void main(String[] args) {
        String s1= "abcde";
        String s2= "bdgek";

        System.out.println(printStr(s1,s2));
    }

}
