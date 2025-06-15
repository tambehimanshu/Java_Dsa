package DP;

public class MinimumPathSum { // tc O(n) sc O(1)
    public static int findMinPath(int grids[][]){
        int n = grids.length;
        int m =grids[0].length;
        int prev[]= new int[m];
        for(int i =0;i<n;i++){
            int curr[]=new int[m];
            for(int j =0;j<m;j++){
                if(i==0 && j==0){
                    curr[j]= grids[i][j];
                }
                else{
                    int up = (i>0)? prev[j] :Integer.MAX_VALUE;
                    int left = (j>0) ? curr[j-1] :Integer.MAX_VALUE;

                    curr[j]= grids[i][j] + Math.min(up, left);

                }
            }
            prev = curr;
        }
return prev[m-1];
    }
    public static void main(String[] args) {
        int [][] grids = {{1,8,1},{1,5,1},{4,2,1}};
        System.out.println(findMinPath(grids));
    }
}
