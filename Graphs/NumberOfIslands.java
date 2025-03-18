import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    static class Pair{
        int first;
        int second;
        public Pair(int f,int s){
            this.first= f;
            this.second=s;
        }
    }

    public void bfs(int ro,int co,int vis[][],char grid[][]){
        vis[ro][co]=1;
        Queue<Pair> q= new LinkedList<Pair>();
        q.add(new Pair(ro, co));
        int n = grid.length;
        int m = grid[0].length;

        while (!q.isEmpty()) {
            int row= q.peek().first;
            int col = q.peek().second;

            q.remove();

            for(int delrow=-1;delrow<=1;delrow++){
                for(int delcol=-1;delcol<=1;delcol++){
                    int nrow= row+delrow;
                    int ncol= col+delcol;

                    if(nrow>=0 && ncol>=0 && nrow <n && ncol<m && grid[nrow][ncol]=='1' && vis[nrow][ncol]==0){
                        vis[nrow][ncol]=1;
                        q.add(new Pair(nrow, ncol));

                    }
                }
            }

            
        }

    }

public int numberIslands(char[][]grid){
    int n = grid.length;
    int m = grid[0].length;

    int vis [][]= new int [n][m];
    int cnt = 0;
    for(int row =0;row<n;row++){
        for(int col =0;col<m;col++){
            if(vis[row][col]==0 && grid[row][col]=='1'){
                cnt++;
                bfs(row,col,vis,grid);
            }
        }
    }




    return cnt;

}
    public static void main(String[]args){
     char [][] grid = {{'1','1','0','0','0'},
                       {'1','1','0','0','0'},
                       {'0','0','1','0','0'},
                       {'1','0','0','1','1'}};

                NumberOfIslands obj = new NumberOfIslands();
                int res= obj.numberIslands(grid);

                System.out.println("no of island is :"+res);

    
}
}
