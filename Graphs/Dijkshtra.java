import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkshtra {
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

    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;

        public Pair(int n,int d){
            this.node =n;
            this.dist =d;
        }
        @Override public int compareTo(Pair P2){
            return this.dist -P2.dist;
        }
    }

    public static void dijkshtraa(ArrayList<Edge> graph [],int src , int v){
        PriorityQueue<Pair> pq =new PriorityQueue<>();
        int []dist=new int [v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src]=0;
        pq.add(new Pair(src, 0));

        while(!pq.isEmpty()){
            Pair current =pq.poll();
            int u =current.node;

            for(Edge e : graph[u]){
                int z = e.dest;
                int weight = e.wt;


                if(dist[u]+weight<dist[z]){
                    dist[z]=dist[u]+weight  ;
                    pq.add(new Pair(z, dist[z]));
                }
            }
        }
        System.out.println("vertex distance from source");
        for(int i=0;i<v;i++){
            System.out.println(i+" "+dist[i]);
        }
    }

 
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>(); 
           
        }

        // Adding edges
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 3));
        graph[1].add(new Edge(1, 0, 2));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 5));
        graph[2].add(new Edge(2, 0, 3));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3, 1, 5));
        graph[3].add(new Edge(3, 2, 2));
    }

    public static void main(String[] args) {
        int v = 4;

       
        @SuppressWarnings("unchecked") 
        ArrayList<Edge>[] graph =  new ArrayList[v];

        createGraph(graph);

        
        dijkshtraa(graph,0,v);
    }
}
