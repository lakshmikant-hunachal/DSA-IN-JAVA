import java.util.*;

class Solution {
    public int maxSum(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }

        int n = nums.length;
        int ans[] = new int[n];

        // step 1: store max digit of each number
        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            int max = 0;

            while (temp > 0) {
                int rem = temp % 10;
                if (rem > max) {
                    max = rem;
                }
                temp = temp / 10;
            }
            ans[i] = max;
        }

        int maxSum = -1;

        // step 2: check pairs with same max digit
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ans[i] == ans[j]) {
                    maxSum = Math.max(maxSum, nums[i] + nums[j]);
                }
            }
        }

        return maxSum;
    }
}