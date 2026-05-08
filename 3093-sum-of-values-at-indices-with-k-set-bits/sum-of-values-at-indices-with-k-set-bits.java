class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int arr[] = new int[nums.size()];
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i>>1]+(i&1);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
               sum=sum+nums.get(i);
            }
        }
        return sum;    }
}