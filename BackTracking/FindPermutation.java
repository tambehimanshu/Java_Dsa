package BackTracking;

public class FindPermutation { //tc O(n) sc(n)
    public static void findper(String str, String ans){
        // base case 
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion 
        for(int i =0;i<str.length();i++){
            char curr =str.charAt(i);

           String Newstr= str.substring(0, i)+str.substring(i+1);
            findper(Newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findper(str, "");
    }
    
}
// tcO(n*n!)   

// str = "abc"

// First loop: pick 'a'
// → call findper("bc", "a")

// inside: pick 'b' → findper("c", "ab") → prints "abc"

// pick 'c' → findper("b", "ac") → prints "acb"

// Backtrack: pick 'b'
// → call findper("ac", "b")

// pick 'a' → "bac"

// pick 'c' → "bca"

// Backtrack: pick 'c'
// → call findper("ab", "c")

// pick 'a' → "cab"

// pick 'b' → "cba"

// ✅ Output: abc, acb, bac, bca, cab, cba