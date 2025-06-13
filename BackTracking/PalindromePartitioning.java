package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static List<List<String>>partation(String s){
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(0,s,path,res);
        return res;
    }
    public static void func(int index ,String s,List<String>path,List<List<String>>res){
        if(index ==s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i= index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                path.add(s.substring(index, i+1));
                func(i+1, s, path, res) ;
                path.remove(path.size()-1);
            }
        }
    }
   public static boolean isPalindrome(String s ,int start,int end){
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s ="aabb";
    List<List<String>> result = partation(s);
    System.out.println(result);
    }
    
    
}
//tcO(2^n)