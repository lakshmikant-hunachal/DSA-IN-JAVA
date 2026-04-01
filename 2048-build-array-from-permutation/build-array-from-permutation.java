class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        if(nums.length==0)
        {
            return ans;
        }
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}