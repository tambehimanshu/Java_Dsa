import java.util.HashMap;

public class Anagram {  //tc O(m+n)  sc O(1)
    public  static boolean find(String s1 ,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character,Integer> charCount = new HashMap<>();

        for(char ch :s1.toCharArray()){
            charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
        }

        for(char ch : s2.toCharArray()){
            charCount.put(ch, charCount.getOrDefault(ch, 0)-1);
        }
        for(var pair: charCount.entrySet()){
            if(pair.getValue()!=0){
                return false;   
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        String s1 = "aaabbca";
        String s2 ="aabbca";

        System.out.println("Given Strings are Anagram or not : "+find(s1, s2));
    }
    
}