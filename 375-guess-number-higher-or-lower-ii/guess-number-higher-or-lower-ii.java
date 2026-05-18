class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp=new int[n+2][n+2];
        return solve(1,n,dp);
    }
    private int solve(int s,int e,int[][] dp)
    {
        if(s>=e)
        {
            return 0;
        }
        if(dp[s][e]!=0)
        {
            return dp[s][e];
        }
        int ans=Integer.MAX_VALUE;
        for(int i=s;i<=e;i++)
        {
            int cost=i+Math.max(solve(s,i-1,dp),solve(i+1,e,dp));
            ans=Math.min(cost,ans);
        }
        dp[s][e]=ans;
        return ans;
    }
}