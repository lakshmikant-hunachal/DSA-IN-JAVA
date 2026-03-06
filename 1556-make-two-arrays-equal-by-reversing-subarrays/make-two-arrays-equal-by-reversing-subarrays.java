class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(arr.length!=target.length)
        {
            return false;
        }
        sort(target);
        sort(arr);
        boolean ans=true;;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=target[i])
            {
                ans=false;
                break;
            }
        }
        return ans;
    }
    private  void sort(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            boolean flag=false;
            for(int j=0;j<nums.length-1-i;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag)
            {
                break;
            }
        }
    }
}