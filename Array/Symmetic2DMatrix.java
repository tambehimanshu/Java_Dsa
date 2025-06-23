public class Symmetic2DMatrix {
 //tc O(n^2) sc O(1)
    public static boolean checkSym(int arr[][]){
        int  n = arr.length;
        int m = arr[0].length;

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){

                if(arr[i][j]!= arr[j][i]){
                    return false;
                }

            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        int arr[][]={{1,2,3},{2,4,5},{3,5,6}};

        boolean res = checkSym(arr);
        System.out.println(res);
    }
}
