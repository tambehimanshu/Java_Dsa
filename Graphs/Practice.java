import java.util.ArrayList;

public class Practice {

    static class Edge{
        int src ;
        int dest;
        int wt;

        public Edge(int s ,int d ,int w){
            this.src =s;
            this.dest =d;
            this.wt =w;
        }

    }
    public static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 3));

        graph[1].add(new Edge(1, 0, 2));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 3));
        graph[2].add(new Edge(2, 4, 5));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 5, 4));

       
    }
    public static void main(String[]args){
int v =4;

@SuppressWarnings("unchecked")
ArrayList<Edge> graph[]= new ArrayList[v];

creategraph(graph);

for(int i=0;i<graph[2].size();i++){
    Edge e = graph[2].get(i);
    System.err.println(e.dest +" "+e.wt);
}
    }
    
}
