class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;
        int m = queries.length;
        int ans[] = new int[m];
        Arrays.sort(nums);
        for(int i=0;i<m;i++)
        {
            int count=0;
            int sum=0;
            for(int j=0;j<n;j++)
            {
                if(sum+nums[j]<=queries[i])
                {
                    sum=sum+nums[j];
                    count++;
                }
                else
                {
                    break;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}