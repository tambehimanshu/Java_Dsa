package BackTracking;

import java.util.Arrays;

public class GridWays {
    public static int grridway(int i,int j,int dp[][]){

        //base case 
        if(i==0 && j== 0){
            return 1;
        }
        else if(i<0|| j <0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int w1=grridway(i-1, j,dp);
        int w2 = grridway(i, j-1,dp);

        return dp[i][j]=w1+w2; 

    }
    public static void main(String[] args) {
        int n =3 ,m=3;

        int dp[][]= new int[n][m];
        for(int []row :dp) Arrays.fill(row, -1);
        System.out.println(grridway(2,2,dp));


    }
    
}
// tc O(2^n+m)
//by using permintation tc O(m+n)
