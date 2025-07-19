class Dp{
    public static int funcMin(int[][]triangle){ // tc O(n*n ) sc(n)

        int n = triangle.length;
        int []front = new int[n];
        int [] curr= new int[n];


        for(int j=0;j<n;j++){
            front[j]= triangle[n-1][j];
            
        }
        for(int i=n-2;i>=0;i--){
            for(int j =i;j>=0;j--){
                int down = triangle[i][j] + front[j];
                int diagonal = triangle[i][j] + front[j+1];

                curr[j]= Math.min(down, diagonal);
            }
            front = curr.clone();
        }
        return front[0];
    }
    public static void main(String[] args) {
        int [][]triangle = {{1},
                            {2,3},
                            {4,5,6},
                            {7,8,9,1}};

     int res = funcMin(triangle);
     System.out.println(res);
    }
}