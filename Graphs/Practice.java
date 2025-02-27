import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Practice {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s ,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
        public static void creategraph(ArrayList<Edge> graph[]){
            for(int i =0;i<graph.length;i++){
                graph[i]=new ArrayList<Edge>();

            }
            graph[0].add(new Edge(0, 1, 2));
            graph[1].add(new Edge(1, 0, 2));
            graph[2].add(new Edge(2, 1, 1));
            graph[2].add(new Edge(2, 0, 3));
        }

       public static void bfs(ArrayList<Edge> graph[],int v){
        Queue <Integer> q = new LinkedList<>();

        boolean vis[]= new boolean[v];

        for(int i =0;i<v;i++){
            if(!vis[i]){
                q.add(i);
            

            while (!q.isEmpty()) {
                int current = q.remove();
                if (!vis[current]) {
                    System.out.println(current+" ");
                    vis[current]=true;

                    for(int j= 0;j<graph[current].size();j++){
                        Edge e = graph[current].get(j);
                        if(!vis[e.dest]){
                            q.add(e.dest);
                        }
                    }
                    
                    
                }
            }
                
            }
        }
       }
    public static void main(String[]args){
        int v =3;

        @SuppressWarnings("unchecked")  
        ArrayList<Edge> graph[]= new ArrayList[v];
        creategraph(graph);
        bfs(graph,v);
        System.out.println();
    }
}
