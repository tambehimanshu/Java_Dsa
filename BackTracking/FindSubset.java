package BackTracking;

public class FindSubset {
    public static void findSsubset(String s,String ans,int curIdx){
        //base case

        if(curIdx == s.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            System.err.println(ans);
            return;
        }
        //recursion
        //yes choice 
        findSsubset(s, ans+s.charAt(curIdx), curIdx+1);
        //no choice
        findSsubset(s, ans, curIdx+1);
    }
    public static void main(String[] args) {
        String s = "abc";
        findSsubset(s, "", 0);
    }
    
}
//tc O(n*2^n)
// sc O(n)