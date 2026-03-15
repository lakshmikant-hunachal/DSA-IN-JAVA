import java.util.*;

class Solution {
    public int missingMultiple(int[] nums, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % k == 0) {
                list.add(nums[i]);
            }
        }

        int arr[] = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        Arrays.sort(arr);

        int expected = k;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == expected) {
                expected += k;
            } 
            else if (arr[i] > expected) {
                return expected;
            }

        }

        return expected;
    }
}