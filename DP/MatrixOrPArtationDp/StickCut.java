package DP.MatrixOrPArtationDp;

public class StickCut {
    public static int minCostToCutStick(int[] cuts, int n ) { // tc O(n^3) sc O(n^2)

        int m = cuts.length;
        if (m == 0) return 0; // no cuts, no cost

        if (n == 0) return 0; 
        
        int newCuts[] = new int[m + 2];  // +2 coz adding 0 to the start and n to the end
        newCuts[0] = 0; 
        newCuts[m + 1] = n;// used when cost calcuation

        for (int i = 1; i < m; i++) {
            newCuts[i] = cuts[i]; // copy cuts to new array
        }
        java.util.Arrays.sort(newCuts); 

    return minCost(newCuts, 1, m );
        
    }
    private static int minCost(int[] cuts, int i, int j) { // tc O(n^3) sc O(n^2) 
        // same like mcm i j
        if (i > j) return 0; // no cuts to make
        int minCost = Integer.MAX_VALUE;
        for (int k = i; k <= j; k++) {
            int cost = cuts[j + 1] - cuts[i - 1] + minCost(cuts, i, k - 1) + minCost(cuts, k + 1, j);

            minCost = Math.min(minCost, cost);

        }
        return minCost;
        }
    public static void main(String[] args) {
        int[] arr = {1,3, 4, 5};
        int n = 7;

        System.out.println("Minimum cost to cut the stick: " + minCostToCutStick(arr, n));
    }
}
