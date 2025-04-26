import java.util.ArrayList;
//tc O(m+n)  sc O(m)
public class SearchPatttenKLM {
    public static void constructlps(String pat, int[] lps){
    int len =0 ;
    lps[0]=0;
    
    int i =1;
    while(i<pat.length()){
        if(pat.charAt(i) ==pat.charAt(len)){
            len++;
            lps[i]= len;
            i++;
        }
        else{
            if(len != 0){
                len = lps[len-1];
            }
            else{
                lps[i]=0;
                i++;
            }
        }
    }
}

    public static ArrayList<Integer> search(String pat, String txt) {
        // your code here
        int n = txt.length();
        int m = pat.length();
        
        int [ ] lps = new int[m];
        ArrayList<Integer> res = new ArrayList<>();
        
        constructlps(pat,lps);
        
        int i =0;
        int j =0;
        
        while(i<n){
            if(txt.charAt(i)== pat.charAt(j)){
                i++;
                j++;
                
                if(j== m){
                    res.add(i-j);
                    
                    j=lps[j-1];
                }
            }
            else{
                if(j!= 0)
                j=lps[j-1];
                else
                i++;
            }
        }
        return res;
        
    }
    public static void main(String[] args) {

        String txt = "aabaacaadaabaaba"; 
        String pat = "aaba"; 

        ArrayList<Integer> res = search(pat, txt);
        for (int i = 0; i < res.size(); i++) 
            System.out.print(res.get(i) + " ");
        
    }
}
