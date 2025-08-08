import java.util.ArrayList;
import java.util.List;

public class GraphBasic {
     static class Graph {
        int V; // number of vertices
        List<List<Integer>> adj; // adjacency list

        // Constructor
        Graph(int V) {
            this.V = V;
            adj = new ArrayList<>(V);
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>()); // initialize each vertex list
            }
        }

        // Add edge (undirected)
        void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u); // remove this line if directed
        }

        // Print adjacency list
        void printGraph() {
            for (int i = 0; i < V; i++) {
                System.out.print(i + " -> ");
                for (int neighbor : adj.get(i)) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        // Create a graph with 5 vertices (0 to 4)
        Graph g = new Graph(5);

        // Add edges
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        // Print the graph
        g.printGraph();
    }
}
