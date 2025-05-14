package Matrix;

public class RotateImage {
    
    public static void findImage(int [][] matrix){ //sc O(1)
        int n = matrix.length;

        // transpose of the matriz  // tc O(n/2 * n/2)

        for(int i =0 ;i< n-1;i++){
            for(int j =1 ;j<n;j++){
                swap( matrix,i,j);
            }
        }

        // reverse the transpose matrix  tc O(n*n/2)
        for(int i =0;i<n;i++){
            int [] temp = matrix[i];
            reverse(temp);
        }
        return;
    }
    public static void reverse(int [] temp){
        int left = 0;
        int right = temp.length-1;

        while (left< right) {
            int demo = temp[left];
            temp[left]= temp[right];
            temp[right]= demo;

            left++;
            right--;
            
        }
    }
    public static void swap(int matrix[][], int i , int j ){
        int temp = matrix[i][j];
        matrix[i][j]= matrix[j][i];
        matrix[j][i]= temp;
    }
    public static void main(String[] args) {
        int [][] matrix= {{1,2,3},
                           {4,5,6},
                          {7,8,9}};
        findImage(matrix);

        for(int i =0 ;i<matrix.length;i++){
            
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
