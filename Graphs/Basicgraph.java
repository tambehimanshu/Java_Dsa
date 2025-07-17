import java.util.*;

public class Basicgraph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

 
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>(); 
        }

        // Adding edges
        graph[0].add(new Edge(0, 1, 2));
        graph[1].add(new Edge(1, 0, 2));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 0, 3));
    }

    public static void main(String[] args) {
        int v = 4;

       
        @SuppressWarnings("unchecked") 
        ArrayList<Edge>[] graph =  new ArrayList[v];

        createGraph(graph);

        // Printing edges for node 2
        for (int i = 0; i < graph[1].size(); i++) {
            Edge e = graph[1].get(i);
            
            System.out.println(e.dest + " " + e.wt);
        }
    }
}
