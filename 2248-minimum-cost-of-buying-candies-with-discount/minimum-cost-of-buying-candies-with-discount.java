class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int buy = 0;
        int k = 0;

        for (int i = cost.length - 1; i >= 0; i--) {
            if (k == 2) {
                k = 0;      
                continue;
            }

            buy += cost[i];
            k++;
        }

        return buy;
    }
}