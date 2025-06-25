package Patterns;

public class PascalsPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i =0;i<n;i++){
            //space 
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
          

            // main logic
            int num =1;
            for(int j =0;j<=i;j++){
                
                System.out.print(num+" ");
                num = num*(i-j)/(j+1);
            }
              System.out.println();
        }
    }
}
