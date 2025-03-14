import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Practice{
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int wt){
            this.src=s;
            this.dest=d;
            this.wt=wt;
        }
    }
    public static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[0].add(new Edge(0, 4, 0));
        graph[1].add(new Edge(1, 2, 2));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 0, 3));

    }

    public static void bfs(ArrayList<Edge> graph[], int v){
      Queue<Integer> q = new LinkedList<>();
      boolean vis [] = new boolean[v];


      for(int i =0;i<graph.length;i++){
        if(! vis[i]){
            q.add(i);
        }

        while(!q.isEmpty()){
            int curr = q.remove();
        if(!vis[curr]){
            System.out.print(curr);
            vis[curr]= true;

            for(int j=0;j<graph[curr].size();j++){
                Edge e = graph[curr].get(j);
                if(!vis[e.dest]){
                    q.add(e.dest);
                }
            }
        }
        }
        
      }


    }
    public static void dfs(ArrayList<Edge> graph[], int  curr ,boolean vis[]){
        System.out.print(curr +" ");
        vis[curr]=true;

        for(int i =0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }

public static boolean cycdet(ArrayList<Edge> graph[],int curr,boolean vis[],boolean rec []){
    vis[curr]=true;

    rec[curr]=true;
    for(int i =0 ;i<graph[curr].size();i++){
        Edge e = graph[curr].get(i);

        if(rec[e.dest ])
        {
             return true;

        }else if (!vis[e.dest]){
            if(cycdet(graph, e.dest, vis, rec)){
                return true;
            }

        }
    }
    rec[curr]=false;
    return false;
}
    public static void main(String[]args){
        int v =5;

       @SuppressWarnings("unchecked")
       ArrayList<Edge> [] graph= new ArrayList[v];

        creategraph(graph);


        boolean vis[]= new boolean[v];
        boolean rec[]= new boolean[v];

        // dfs(graph, 0,vis);

        boolean res = cycdet(graph,0, vis,rec);
    
        if(res){
            System.out.println("cycle");
        }else {
            System.out.println("not cyc");
        }
       
    


    }
}