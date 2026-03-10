class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(k==0 || nums.length==0)
        {
            return 0.0;
        }
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        int maxsum=sum;
        for(int i=k;i<nums.length;i++)
        {
            sum=sum+nums[i]-nums[i-k];
            maxsum=Math.max(maxsum,sum);
        }
        return (double)maxsum/k;
    }
}