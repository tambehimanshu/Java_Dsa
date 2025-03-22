package Greedy;
import java.util.*;
import java.util.HashSet;

public class LongestPalindrome {
     public static int longestPalindromeCode(String s) {
        HashSet<Character> set = new HashSet<>();

        int length = 0;

        for(char c :s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                length+=2;
            }
            else {
                set.add(c);
            }
        }
        if(!set.isEmpty()){
            length += 1;
        }
        return length;
        
    }
    public static void main(String[] args) {
        String s = "vcaaaahh";

        int res = longestPalindromeCode(s);
        System.out.println("longest palindrome can be formed of length : "+res);
    }
    
}
// tc O(n) sc O(1)
