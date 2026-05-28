import java.util.*;

class Solution {
    public int subarrayBitwiseORs(int[] arr) {

        Set<Integer> ans = new HashSet<>();

        Set<Integer> prev = new HashSet<>();

        for (int num : arr) {

            Set<Integer> curr = new HashSet<>();

            // subarray containing only current number
            curr.add(num);

            // extend previous subarrays
            for (int x : prev) {
                curr.add(x | num);
            }

            // add all current OR values to answer
            ans.addAll(curr);

            prev = curr;
        }

        return ans.size();
    }
}