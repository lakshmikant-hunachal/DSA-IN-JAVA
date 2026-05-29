class Solution {
    public int minElement(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        for(int i=0;i<nums.length;i++)
        {
            int num=0;
            int temp=nums[i];
            while(temp>0)
            {
                num=num+temp%10;
                temp=temp/10;
            }
            nums[i]=num;
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(ans>nums[i])
            {
                ans=nums[i];
            }
        }
        return ans;
    }
}