class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int ans=-1;
        for(int i=1;i<nums.length;i++)
        {
            if(min>nums[i])
            {
                min=nums[i];
            }
            if(max<nums[i])
            {
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>min && nums[i]<max)
            {
                ans=nums[i];
                break;
            }
        }
        return ans;
    }
}