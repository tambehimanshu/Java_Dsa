package Patterns;

public class AlphabetPattern {
    public static void main(String[] args) {
       // char ch = 'A' for contineous alphabet like A BC DEF
        int n =4; 
        for(int i =1;i<=n;i++){
             char ch = 'A'; // Ffor repeat aplhabet like A AB ABC ABCD
            for(int j =1;j<=i;j++){
             System.out.print(ch+" ");
            ch++;
            }
           System.out.println();
        }
       
    }
}
