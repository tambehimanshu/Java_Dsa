package NormalCodes;

public class FruitsIntoBasket {
    public static int maxFruits(int[] fruits) {
        int n = fruits.length;
        int maxFruits = 0;
        int left = 0, right = 0;
        int[] count = new int[n + 1]; 

        while (right < n) {
            count[fruits[right]]++;
            while (count[fruits[right]] > 2) {
                count[fruits[left]]--;
                left++;
            }
            maxFruits = Math.max(maxFruits, right - left + 1);
            right++;
        }
        return maxFruits;
    }
    public static void main(String[] args) {
        int[] fruits = {1, 2, 1, 2, 3, 3, 4};
        System.out.println(maxFruits(fruits)); 
    }
}
