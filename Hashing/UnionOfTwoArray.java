import java.util.*;


public class UnionOfTwoArray { // tc O(n+m) sc O(n+m)
    public static ArrayList<Integer> findUnion(int a[],int b[]){
        HashSet<Integer> st = new HashSet<>();

        for(int n :a){
            st.add(n);

        }

        for(int m :b){
            st.add(m);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for(int it :st){
            res.add(it);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={2,3,2};
        int b[]= {3,2,2,3,3,2};

        ArrayList<Integer> res = findUnion(a,b);
        for(int num:res){
            System.out.println(num+" ");
        }
    }
    
}
