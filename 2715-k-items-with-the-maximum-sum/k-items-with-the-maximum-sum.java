class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        
        int sum = 0;

        // Step 1: take 1's
        int takeOnes = Math.min(numOnes, k);
        sum += takeOnes;
        k -= takeOnes;

        // Step 2: take 0's
        int takeZeros = Math.min(numZeros, k);
        k -= takeZeros;

        // Step 3: take -1's
        int takeNegOnes = Math.min(numNegOnes, k);
        sum -= takeNegOnes;

        return sum;
    }
}