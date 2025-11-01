package BackTracking;
import java.util.*;

public class MColoring {
    public static boolean isSafe(int node,int graph[][],int m,int v,int color[],int col){
        for(int i=0;i<v;i++){
            if(graph[node][i] ==1 && color[i]==col){
                return false;
            }
        }
        return true;
    }
    public static boolean helper(int node , int graph[][],int m,int v,int color[]){
        if(node ==v){
            return true;
        }
        for(int col =1;col<=m;col++){
            if(isSafe(node,graph,m,v,color,col)){
                color[node]=col;
                if(helper(node+1, graph, m, v, color)){
                    return true; // neighbour node
                }
                color[node]=0;//bt
            }
        }
        return false;
    }
    public static boolean graphColor(int graph[][],int m,int v){
        int color[]=new int[v];
        Arrays.fill(color,0);

        return helper(0,graph,m,v,color);
    }
    public static void main(String[] args) {
        int v =4;
        int graph[][]={
            {0,1,1,1},
            {1,0,1,0},
            {1,1,0,1},
            {1,0,1,0},
        };

        int m = 3;//max no of colors;

        if(graphColor(graph,m,v)){
            System.out.println("graph can be colored with "+m+" colors ");
        }
        else{
            System.out.println("graph cant color with "+m +" colors");
        }///
    }
    
}
