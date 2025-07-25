package NormalCodes;


public class CheckDivisibilityBySumAndProduct {
    public static boolean chechD(int num ){
        int org =num;
        int sum =0;
        int product =1;

        while(num >0){
            int digit = num %10;
            sum += digit;
            product *= digit;
            num = num/10;
        }
        int total = sum + product;
        return (org % total == 0 );
    }

    public static void main(String[] args) {
        int num =98;

        System.out.println(chechD(num));
    }
}
