#include <stdio.h>

int uniquePaths(int m, int n) {

    int dp[m][n];

    // Fill first row with 1
    for(int i = 0; i < n; i++) {
        dp[0][i] = 1;
    }

    // Fill first column with 1
    for(int i = 0; i < m; i++) {
        dp[i][0] = 1;
    }

    // Calculate remaining cells
    for(int i = 1; i < m; i++) {
        for(int j = 1; j < n; j++) {
            dp[i][j] = dp[i-1][j] + dp[i][j-1];
        }
    }

    return dp[m-1][n-1];
}