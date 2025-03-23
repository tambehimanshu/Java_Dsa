package Greedy;

public class LemonadeChange {

    public static boolean LemonadeChange(int bills[]){
        int five =0, ten =0;

        for(int i =0;i<bills.length;i++){
            if(bills[i]==5){
                five +=1;

            }
            else if(bills[i]==10){
                if(five>0){
                    five-=1;
                    ten+=1;
                }
                else return false;
            }
            else {
                if(five>0 && ten >0){
                    five-=1;
                    ten-=1;
                }
                else if(five>=3){
                    five =five-3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int bills[]={5,5,10,10,20};

        boolean res= LemonadeChange(bills);

       System.out.println(res);
    }
    
}
//tc O(n)

