class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int  currentsum=0;
        for(int i=0;i<n-1;i++)
        {
          if(nums[i]!=i+1)
          {
            return false;
          }
        }
       return nums[n-1]==n-1;
    }
}