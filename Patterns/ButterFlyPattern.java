package Patterns;

public class ButterFlyPattern {
    public static void main(String[] args) {
        int n =4;
        for(int i=1;i<=n;i++){
          // phase 1
            // for star
            for(int j =1;j<=i;j++){
                System.out.print("*");

            }

            //space 2*n-1;

            for(int j=1;j<= 2*(n-i);j++){
                System.out.print(" ");
            }

            // right side star
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // for down part
         for(int i=n;i>=0;i--){
          // phase 1
            // for star
            for(int j =1;j<=i;j++){
                System.out.print("*");

            }

            //space 2*n-1;

            for(int j=1;j<= 2*(n-i);j++){
                System.out.print(" ");
            }

            // right side star
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
