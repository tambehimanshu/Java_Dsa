import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgo {
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
        graph[0].add(new Edge(0, 3, 6));
        graph[1].add(new Edge(1, 0, 2));
        graph[1].add(new Edge(1, 2, 3));
        graph[1].add(new Edge(1, 3, 8));
        graph[1].add(new Edge(1, 4, 5));
        graph[2].add(new Edge(2, 1, 3));
        graph[2].add(new Edge(2, 4, 7));
        graph[3].add(new Edge(3, 1, 8));
        graph[3].add(new Edge(3, 4, 9));
        graph[3].add(new Edge(3, 0, 6));
        graph[4].add(new Edge(4, 1, 5));
        graph[4].add(new Edge(4, 3, 9));
        graph[4].add(new Edge(4, 2, 7));
    }
    static class Pair implements Comparable<Pair>{
        int v;
        int cost;

        public Pair(int v, int c){
        this.v= v;
        this.cost=c;

        }
        @Override
        public int compareTo(Pair p2){
            return this.cost  - p2.cost;
        }
    }

    public static void prims(ArrayList<Edge>[] graph){
        boolean vis[]= new boolean[graph.length];

        PriorityQueue<Pair>pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalCost =0;

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.v]){
            vis[curr.v]=true;

            finalCost+= curr.cost;

            for(int i =0;i<graph[curr.v].size();i++){
                Edge e = graph[curr.v].get(i);
                pq.add(new Pair(e.dest, e.wt));
            }
        }

        }
        System.out.println("final cost :"+finalCost);


    }
    public static void main(String[] args) {
        int v = 5;

       
        @SuppressWarnings("unchecked") 
        ArrayList<Edge>[] graph =  new ArrayList[v];

        createGraph(graph);
        prims(graph);

       
    }
}
