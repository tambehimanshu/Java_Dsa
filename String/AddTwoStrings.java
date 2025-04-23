public class AddTwoStrings {
    public static String trimZeros(String s){
        int firstOne = s.indexOf('1');
        return(firstOne ==-1)? "0":s.substring(firstOne);
    }

    public static String addTwo(String s1 , String s2){ //tc O(n+m) sc O(n)
        s1= trimZeros(s1);
        s2 = trimZeros(s2);

        int n = s1.length();
        int m = s2.length();

        if(n<m){
            return addTwo(s2, s1);
        }
        int j =m-1;
        int carry =0;

        StringBuilder result = new StringBuilder();

        for(int i =n-1;i>=0;i--){
            int bit1 = s1.charAt(i)-'0';
            int sum = bit1 + carry;
            
            if(j>=0){
                int bit2 = s2.charAt(j)-'0';
                sum = sum+bit2; 
                j--;
            }
            int bit = sum %2;
            carry = sum/2;

            result.append((char)(bit+'0'));
        }
        if(carry>0){
            result.append('1');
        }
            return result.reverse().toString();

    }
    public static void main(String[] args) {
        String s1 = "1101";
        String s2 = "111";

        System.out.println(addTwo(s1, s2));
    }
    
}
