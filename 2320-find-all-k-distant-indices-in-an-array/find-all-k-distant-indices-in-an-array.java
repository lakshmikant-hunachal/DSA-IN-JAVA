import java.util.*;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {

        List<Integer> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == key) {
                l.add(i);
            }
        }

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < l.size(); j++) {
                if(Math.abs(i - l.get(j)) <= k) {
                    list.add(i);
                    break;
                }
            }
        }

        return list;
    }
}