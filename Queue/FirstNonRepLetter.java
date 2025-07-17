package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepLetter {
    public static void findNonRep(String s){
        int freq [ ] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while (!q.isEmpty() && freq[q.peek()-'a']> 1) {  // from elements which are greter than 1 
                q.remove();
                
            }
            if (q.isEmpty()) {
                System.out.print(-1+" ");
                
            }else{
                System.out.print(q.peek()+" ");
            }



        }
        System.out.println();
    }
    public static void main(String[] args) {
        String s  ="aabccxb"; 
        findNonRep(s);
    }

}

//tc O(n)
//sc O(n)
