public class FrogJump {
    public static int findMinEnergyWaste(int arr[]){
        int n = arr.length;
        int prev=0;
        int prev2=0;

        for(int i =1;i<arr.length;i++){
            int oneStep = prev + Math.abs(arr[i] - arr[i-1]);

            int twostep = Integer.MAX_VALUE;
        if(i>1){
            twostep = prev2+Math.abs(arr[i]-arr[i-2]);
        }
        int curr = Math.min(oneStep,twostep);
        prev2 = prev;
        prev = curr;
        }
        return prev;

    }
    public static void main(String[] args) {
        int arr[]={30,10,60,10,60,50};

        System.out.println(findMinEnergyWaste(arr));
    }
}
