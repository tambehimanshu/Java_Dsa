import java.util.ArrayList;

public class Dfs {
    static class Edge{
        int src ;
        int dest;
        int wt;

        public Edge(int s ,int d,int w){
            this.src =s;
            this.dest=d;
            this.wt=w;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[]){
        for (int  i =0;i<graph.length;i++){
            graph[i]= new ArrayList<>();

        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 3));
        graph[0].add(new Edge(0, 3, 1));
        graph[1].add(new Edge(1, 0, 2));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 3));
        graph[2].add(new Edge(2, 1, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 0, 1));

    }

    public static void dfs(ArrayList<Edge>graph[],int current , boolean vis[]){
        System.out.print(current+" ");
        vis[current]=true;

        for(int i=0;i<graph[current].size();i++){
            Edge e = graph[current].get(i);

            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }


    }

    public static void main(String[]args){
        int v =4;
@SuppressWarnings("unchecked")
        ArrayList<Edge>graph[]= new ArrayList[v];
        creategraph(graph);
        boolean vis[] = new boolean[v];

        for(int i =0;i<v;i++){
            if(!vis[i]){
                dfs(graph,i,vis);
            }
            
        }
        
    }
    
}
