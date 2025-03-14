import java.util.ArrayList;

public class Practice{
    static class Edge{
        int src;
        int dst;
        int wt;

        public Edge(int s,int d,int wt){
            this.src=s;
            this.dst=d;
            this.wt=wt;
        }
    }
    public static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[0].add(new Edge(0, 3, 0));

    }
    public static void main(String[]args){
        int v =4;

       @SuppressWarnings("unchecked")
       ArrayList<Edge> [] graph= new ArrayList[v];

        creategraph(graph);

        for (int i = 0; i < graph.length; i++) {
            System.out.print("Vertex " + i + ": ");
            for (int j = 0; j < graph[i].size(); j++) {  
                Edge e = graph[i].get(j);  
                System.out.print("(" + e.dst + ", " + e.wt + ") ");
            }
            System.out.println();
        }

    }
}