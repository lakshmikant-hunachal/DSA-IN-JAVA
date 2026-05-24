class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];

        // Initialize
        for (int j = 1; j <= amount; j++) {
            dp[0][j] = Integer.MAX_VALUE - 1;
        }

        // Fill DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {

                // If coin can be used
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(
                        1 + dp[i][j - coins[i - 1]],
                        dp[i - 1][j]
                    );
                } 
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        if (dp[n][amount] == Integer.MAX_VALUE - 1) {
            return -1;
        }

        return dp[n][amount];
    }
}