package BackTracking;

public class Practice {

    static int count =0;
    public static void findPermu(String rcb ,String res){
        if(rcb.length() ==0) 
        {
            System.out.println(res);
            count++;
         return;
        }
    
     for(int i =0;i<rcb.length();i++){
        char current = rcb.charAt(i);
        String newStr  = rcb.substring(0, i) + rcb.substring(i+1);
        findPermu(newStr, res + current);

     }
    }
    public static void main(String[]args){
        String rcb = "abcd";
        findPermu(rcb,"");
        System.out.println(count);
    }
    
}
