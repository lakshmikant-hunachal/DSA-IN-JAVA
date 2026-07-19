class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[] = new int[nums.length];
        int neg=1;
        int pos=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                arr[neg]=nums[i];
                neg+=2;
            }
            else
            {
                arr[pos]=nums[i];
                pos+=2;
            }
        }
        return arr;
    }
}
//brute force approach
/*class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];

        int j = 0;
        int k = 0;

        // Separate positives and negatives
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                neg[j++] = nums[i];
            } else {
                pos[k++] = nums[i];
            }
        }

        // Merge alternately
        j = 0;
        k = 0;

        for (int i = 0; i < n; i += 2) {
            nums[i] = pos[j++];
            nums[i + 1] = neg[k++];
        }

        return nums;
    }
}*/