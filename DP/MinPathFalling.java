class Dp{
    public static int findminpath(int path[][]){ //tc O(n2) scO(n)
        int n = path.length;
        int prev []= new int[n];
        
        for(int j =0;j<n;j++){
            prev[j]= path[0][j];

        }

        for(int i=1;i<n;i++){
            int curr[] = new int[n];
            for(int j=0;j<n;j++){
                int up = prev[j];
                int left = j>0? prev[j-1] :Integer.MAX_VALUE;
                int right = j<n-1 ?prev[j+1]:Integer.MAX_VALUE;

                curr[j] = path[i][j]+ Math.min(up, Math.min(left, right)    );

            }
            prev =curr;
        }
        int min =Integer.MAX_VALUE;
        for(int val :prev){
        min = Math.min(val, min);
        }
        return min;
    }

    public static void main(String[] args) {
        int path[][]= {{2,1,3},
                        {6,5,4}, 
                        {6,8,9}};

        System.out.println(findminpath(path));
    }
}