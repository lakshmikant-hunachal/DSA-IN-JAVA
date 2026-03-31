import java.util.Arrays;

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums); // sort first

        int[] n1 = new int[n / 2];
        int[] n2 = new int[n / 2];

        int i1 = 0, i2 = 0;

        // distribute elements alternately after sorting
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                n1[i1++] = nums[i];
            } else {
                n2[i2++] = nums[i];
            }
        }

        return check(n1) && check(n2);
    }

    private boolean check(int[] arr) {
        Arrays.sort(arr); // ensure sorted

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}