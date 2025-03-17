import java.util.ArrayList;

public class RateInMaze {
   
    static int n;
    static ArrayList<String>paths = new ArrayList<>();
 static boolean isSafe(int x,int y,int[][]maze,boolean vis[][]){
    return (x>=0 && x<n && y>= 0&& y<n&& maze[x][y]== 1 && !vis[x][y]);
 }
    static void findPath(int x ,int y,int [][]maze, boolean vis[][],String path){
    if(x==n-1 && y==n-1){
    paths.add(path);
    return;
    }
     vis[x][y]=true;
      // for down 
      if(isSafe(x+1, y, maze, vis)){
        findPath(x+1, y, maze, vis, path+"d" );
      }
      // move left
      if(isSafe(x, y-1, maze, vis)){
        findPath(x, y-1, maze, vis, path+"l");
      }
      //move right
      if (isSafe(x, y+1, maze, vis)) {
        findPath(x, y+1, maze, vis, path+"r");
      }
      //up
      if (isSafe(-1, y, maze, vis)) {
        findPath(-1, y, maze, vis, path+"u");
        
      }
      vis[x][y]=false;
    
}
    public static void main(String[]args){
        int maze[][]={{1,0,0,0},
                      {1,1,0,1},
                    {1,1,0,0},{
                        0,1,1,1
                    }};

                     n =maze.length;
                    boolean vis [][]=new boolean[n][n];

                    findPath(0,0,maze,vis,"");

                    if(paths.size()==0){
                        System.out.println("no path found");
                    }else{
                        System.out.println("found"+paths);
                    }
    }
}
