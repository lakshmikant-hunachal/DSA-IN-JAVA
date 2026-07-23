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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];

        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        // Fill remaining values with -1
        while (list.size() < m * n) {
            list.add(-1);
        }

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        int index = 0;

        while (top <= bottom && left <= right) {

            // Left to Right
            for (int i = left; i <= right; i++) {
                ans[top][i] = list.get(index++);
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                ans[i][right] = list.get(index++);
            }
            right--;

            // Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans[bottom][i] = list.get(index++);
                }
                bottom--;
            }

            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[i][left] = list.get(index++);
                }
                left++;
            }
        }

        return ans;
    }
}