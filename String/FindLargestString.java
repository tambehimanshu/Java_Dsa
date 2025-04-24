public class FindLargestString {

    public static void main(String[] args) {
        String fruits [] = {"apple","mango", "z"};

        String largest = fruits[0];
        for(int i =1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];  // if largest is smaller then fruits[i]
            }
        }
        System.out.println(largest);
    }
    
}

//tcO(x*n)
