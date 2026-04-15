class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] ans=new int[m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    ans[i]=max(nums2,nums2[j],j);
                    break;
                }
            }
        }
        return ans;
    }
    private int max(int[] num,int val,int index)
    {
        int m=-1;
        for(int i=index;i<num.length;i++)
        {
            if(num[i]>val)
            {
                m=num[i];
                break;
            }
        }
        return m;
    }
}