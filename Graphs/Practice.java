import java.util.ArrayList;



public class Practice {

    static class Edge{
int src;
int dest;
int wt;

public Edge(int s ,int d ,int wt){
    this.src=s;
    this.dest=d;
    this.wt=wt;
}
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i =0;i<graph.length;i++){
            graph[i] = new ArrayList<>();


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
   public static void main(String[]args){
    int v =4;

    @SuppressWarnings("unchecked")
    ArrayList<Edge> graph[]= new ArrayList[v];
createGraph(graph);

for(int i=0;i<graph[1].size();i++){
    Edge e = graph[1].get(i);
    System.out.println(e.dest+" "+e.wt);
}

   }
}