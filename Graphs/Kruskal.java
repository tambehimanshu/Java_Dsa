import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Kruskal {
     static class Edge  implements Comparable<Edge>{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
        @Override
        public int compareTo(Edge e2){
            return this.wt - e2.wt;
        }
    }
    static int n =4;

    static int par[]=new int[n]; // for parent 
     static int rank[]=new int[n]; //  for rank ie height if a has more height then b ,then b will get connet to a and a will be parent  of b. 
   
    public static void init(){

        for(int i = 0;i<n;i++){
            par[i]=i;// initally every element is parent itself
        }
    }

    public static int find(int x){
        // find is used to find the element is of which set
        if(x ==par[x]){ //base case
            return x;
        } 

       return  par[x]=find(par[x]); // optimize way
    }
    public static void union(int a,int b){
        //union is used to check the height btn two element and if a > b then a is parent of b and vise versa
        int parA = find(a);
        int parB=find(b);

        //case1 
        if(rank[parA]==rank[parB]){
            //now anyone can be parent 

            par[parB]= parA;// a is parent of b !! confirm
            rank[parA]++;

        }
        else if(rank[parA]<rank[parB]){ //c2
            par[parA]=parB;
            rank[parB]++;

        }
        else{//c3
            par[parB]=parA;
            rank[parA]++;
        }
    }
 
    public static void createGraph(ArrayList<Edge> edges) {
       

        // Adding edges
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    public static void Kruskal(ArrayList<Edge> edges,int v){
        init();
        Collections.sort(edges); // element in assendgin  ord
 int mstcost = 0;
 int count = 0;
 for (int i = 0; i < edges.size() && count < v - 1; i++){
Edge e = edges.get(i);
//each edge have src and dest 

int parA = find(e.src);
int parB = find(e.dest);

if(parA != parB){
    union(e.src, e.dest);
    mstcost+= e.wt;

}
  }
  System.out.println(mstcost);

    }

    public static void main(String[] args) {
        int v = 4;

       
        @SuppressWarnings("unchecked") 
        ArrayList<Edge> edges =  new ArrayList<>();

        createGraph(edges);
        Kruskal(edges,v);


       
    }
}
