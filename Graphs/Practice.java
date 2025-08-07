import java.util.*;
public  class Practice{
    static class Edge{
        int vertex;
        int weight;

        Edge(int vertex , int wt){
            this.vertex = vertex;
            this.weight = wt;
        }
    }
    static class Graph{
        int V;
        List<List<Edge>> adj;

        Graph(int V){
            this.V= V;
            adj = new ArrayList<>();
            for(int i =0;i<V;i++){
                adj.add(new ArrayList<>());
            }
        
        }
        void addEdge(int u, int v , int wt){
            adj.get(u).add(new Edge(v, wt));
        }

        

    }
    public static void main(String[] args) {
    
    }
}