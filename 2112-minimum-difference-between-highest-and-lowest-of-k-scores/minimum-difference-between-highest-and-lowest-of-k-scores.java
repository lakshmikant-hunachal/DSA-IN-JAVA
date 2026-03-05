class Solution {
    public int minimumDifference(int[] nums, int k) {

        if(k == 1){
            return 0;
        }

        sort(nums);

        int min = Integer.MAX_VALUE;

        for(int i = 0; i <= nums.length - k; i++)
        {
            int diff = nums[i + k - 1] - nums[i];
            min = Math.min(min, diff);
        }

        return min;
    }
private void sort(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length-1-i;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}