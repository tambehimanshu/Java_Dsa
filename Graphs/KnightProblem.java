import java.util.LinkedList;
import java.util.Queue;

public class KnightProblem {

    private static final int [][]moves ={{-2,-1},{-2,1},{-1,-2},{-1,2},{1,-2},{1,2},{2,-1},{2,1}};
    public static int miniKinghtMoves(int N ,int startX,int startY,int targetX,int targetY){
        //base case
        if(startX == targetX && startY == targetY){
            return 0;
        }

        Queue<int[]>queue = new LinkedList<>();
        queue.add(new int[]{startX,startY,0});

        boolean vis[][]= new boolean[N+1][N+1];
        vis[startX][startY]=true;

        //bfs
        while(!queue.isEmpty()){
            int []cell= queue.poll();
            int x= cell[0],y=cell[1],steps=cell[2];


            for(int []move:moves){
                int nx =x+move[0];
                int ny=y+move[1];

                // check new possition is in the board or not and not vis
                if(nx>=1 && ny >= 1 && nx <= N && ny<= N && !vis[nx][ny]){ 

                    if(nx==targetX && ny == targetY){
                        return steps+1;
                    }

                    vis[nx][ny]=true;
                    queue.add(new int[]{nx,ny,steps+1});

                }
            }
        }




        return -1;

    }
    public static void main(String[]args){
        int N =8;
        int startX =1,startY=1;
        int targetX=8,targetY=8;

        int res =miniKinghtMoves(N,startX,startY,targetX,targetY);
        System.out.println("minimum steps required :"+res);
    }
    
}
