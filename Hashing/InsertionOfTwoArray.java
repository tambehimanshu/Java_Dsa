package Hashing;
import java.util.*;
public class InsertionOfTwoArray { // tc O(n+m) sc (n)

    public static ArrayList<Integer> findInsertion(int a[],int b[]){

        HashSet<Integer> sa = new HashSet<>();
        for(int num:a){
            sa.add(num);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int n :b){
            if(sa.contains(n)){
                res.add(n);
                sa.remove(n);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int a []={1,2,3};
        int b[]= {2,3,4};

        ArrayList<Integer> result = findInsertion(a,b);
        for(int n:result){
            System.err.print(n+" ");
        }
    }
    
}
