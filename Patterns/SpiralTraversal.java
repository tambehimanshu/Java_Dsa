package Patterns;

public class SpiralTraversal {
    public static void main(String[] args) {
        int n =5;
        int [][]matrix = new int[n][n];

        int top =0, bottom = n-1;
        int left =0,right =n-1;
        int num =1;

        while(top <= bottom && left <= right){
            for(int i=left;i<=right;i++){
                matrix[top][i] =num++;
            }
            top++;

            for(int i=top;i<=bottom;i++){
                matrix[i][right]=num++;
            }
            right--;

            for(int i=right;i>=left;i--){
                      matrix[bottom][i] =num++;
            }
       bottom--;
        
       for(int i=bottom ;i>= top;i--){
        matrix[i][left] =num++;
       }
       left++;

    }
     for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d", matrix[i][j]);
            }
            System.out.println();
        }
}
}
