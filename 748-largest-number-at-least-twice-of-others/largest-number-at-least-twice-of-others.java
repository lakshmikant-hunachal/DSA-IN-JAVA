class Solution {
    public int dominantIndex(int[] nums) {
        int ans=-1;
        int max=nums[0];
        int idx=0;
        int count=0;
        for(int i=1;i<nums.length;i++)
        {
            if(max<nums[i]){
                max=nums[i];
                idx=i;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i!=idx && 2*nums[i]<=nums[idx])
            {
               count++;
            }
        }
        if(count!=nums.length-1)
        {
            return -1;
        }
        else
        {
            return idx;
        }
    }
}