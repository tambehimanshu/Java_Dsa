import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

    static class Pair{
        String first;
        int second; // means dist in integer

        Pair(String _first,int _second){
            this.first=_first;
            this.second=_second;
        }
    }

    public static int wordLadderLength(String [] wordlist, String start, String target){
        Queue<Pair> q =new LinkedList<>();
        q.add(new Pair(start, 1));

        Set<String> st = new HashSet<String>();
        int len = wordlist.length;
        for(int i =0;i<len;i++){
            st.add(wordlist[i]);
        }
        st.remove(start);
        while(!q.isEmpty()){
            String word = q.peek().first;
            int steps = q.peek().second;
            q.remove();
            if(word.equals(target)==true)
            return steps;

            //hit

            for(int i = 0;i<word.length();i++){ 
                char replaceCharArray[]=word.toCharArray();//h
                char original = replaceCharArray[i];
                for(char ch='a';ch<='z';ch++){

                    //replace h with a to z
                    // ait
                    //bit
                 // cit ...
                   
                    replaceCharArray[i]=ch;

                    String replacedWord = new String (replaceCharArray);
               /// it exists int the set
                    if(st.contains(replacedWord)==true){
                        st.remove(replacedWord);
                        q.add(new Pair(replacedWord, steps+1));
                    }
 replaceCharArray[i]= original;

                }
            }
          
        }

        return 0;
    

    }
    public static void main(String[]args){
        String wordlist[]={"hot","lot","dot","dog","log","cog"};
        String start = "hit";
        String target = "cog";

        int res= wordLadderLength(wordlist,start,target);
        System.out.println(res);
    }
    
}
