public class DisjoinSet {

    static int n =7;

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

       return  find(par[x]);
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
    public static void main(String[]args){
        
        init();
        System.out.println(find(3));
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        System.out.println(find(2));
        union(3, 6);
        System.out.println(find(6));
        union(1,4);
        System.out.println(find(4));


        System.out.println(find(3));
        System.out.println(find(4));
        union(1, 5);
    }
}
