import java.util.*;
public class FirstNonRepChar{  //tc O(n) sc O(1)
    static final int max_char =26;
    public static char nonrep(String s){
        int vis[]= new int[max_char];

        Arrays.fill(vis, -1);

        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)-'a';

            if(vis[index] ==-1){
                vis[index] =i;
            }
            else{
                vis[index]=-2;
            }
        }
        int idx =-1;
for(int i =0;i<max_char;i++){
    if(vis[i]>=0 && (idx ==-1 || vis[i]<vis[idx])){
        idx = i;
    }
}
return (idx == -1) ? '$' : s.charAt(vis[idx]);
    }
    public static void main(String args[]){
        String s = "aaabcbce";

        System.out.println(nonrep(s));
    }
}