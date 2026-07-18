class Solution {
    public int findGCD(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i=0;i<nums.length;i++)
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
        return gcd(max,min);
    }
    private int gcd(int a,int b)
    {
        while(b>0)
        {
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}