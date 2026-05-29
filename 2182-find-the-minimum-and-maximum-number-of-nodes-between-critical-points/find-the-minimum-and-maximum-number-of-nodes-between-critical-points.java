/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        ArrayList<Integer> values = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            values.add(temp.val);
            temp = temp.next;
        }

        ArrayList<Integer> critical = new ArrayList<>();

        for (int i = 1; i < values.size() - 1; i++) {

            // local minima
            if (values.get(i) < values.get(i - 1) &&
                values.get(i) < values.get(i + 1)) {

                critical.add(i);
            }

            // local maxima
            else if (values.get(i) > values.get(i - 1) &&
                     values.get(i) > values.get(i + 1)) {

                critical.add(i);
            }
        }

        int[] ans = {-1, -1};

        if (critical.size() < 2) {
            return ans;
        }

        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < critical.size() - 1; i++) {
            minDist = Math.min(minDist,
                    critical.get(i + 1) - critical.get(i));
        }

        int maxDist =
                critical.get(critical.size() - 1) - critical.get(0);

        ans[0] = minDist;
        ans[1] = maxDist;

        return ans;
    }
}