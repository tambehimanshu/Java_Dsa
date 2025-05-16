public class SearchInSortedRowColMarix {
    public static boolean findTarget(int mat[][],int target){ // tc O(n+m) scO(1)
        int n = mat.length;
        int m = mat[0].length;
        int i =0;
        int j =m-1;

        while (i<n && j>=0) {
            //case 1
            if(mat[i][j]> target){
                j--;
            }
            else if(mat[i][j]< target){
                i++;
            }
            else {
                return true;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int mat[][]={{3,30,38},
                     {20,52,54},
                     {35,64,69}};

        int target = 35;

        System.out.println(findTarget(mat,target));
    }
}
