// // class Solution {
//     public int pivotIndex(int[] nums) {
//         for(int i=0;i<nums.length;i++)
//         {
//             int left=sum(nums,0,i-1);
//             int right=sum(nums,i+1,nums.length-1);
//             if(left==right)
//             {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     private int sum(int arr[],int s,int e)
//     {
//         int sum=0;
//         for(int i=s;i<=e;i++)
//         {
//             sum+=arr[i];
//         }
//         return sum;
//     }
// //}
// optimal solution
class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int left=0;
        for(int i=0;i<nums.length;i++)
        {
            int right = sum - left- nums[i];
            if(left==right)
            {
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }

}