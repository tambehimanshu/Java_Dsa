package NormalCodes;

public class ReverseInteger { // tc O(x ) sc O (1)
    public static int reverse(int x){
        int rev = 0;

        while(x !=0){
            int digit = x %10;

            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10 ){
                return 0; // over flow
            }
            rev = rev *10 + digit; 
            x=x/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int x = 3241;

        System.out.println(reverse(x));
    }
}
