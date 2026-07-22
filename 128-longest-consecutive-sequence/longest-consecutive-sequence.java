class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int longest=1;
        int small=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-1==small)
            {
                count=count+1;
                small=nums[i];
            }
            else if(nums[i]!=small)
            {
                count=1;
                small=nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}