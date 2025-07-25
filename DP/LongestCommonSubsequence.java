public class LongestCommonSubsequence {  //tc O(n) sc O(n)
    public static int findLongCom(String text1,String text2){
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
        String s2 = "acdef";

        System.out.println(findLongCom(s1,s2));

    }
}
