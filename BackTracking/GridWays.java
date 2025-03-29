package BackTracking;

public class GridWays {
    public static int grridway(int i,int j,int n ,int m){

        //base case 
        if(i==n-1 && j== m-1){
            return 1;
        }
        else if(i==n || j ==m){
            return 0;
        }
        int w1=grridway(i+1, j, n, m);
        int w2 = grridway(i, j+1, n, m);

        return w1+w2; 

    }
    public static void main(String[] args) {
        int n =3 ,m=3;
        System.out.println(grridway(0, 0, n, m));


    }
    
}
// tc O(2^n+m)
//by using permintation tc O(m+n)
