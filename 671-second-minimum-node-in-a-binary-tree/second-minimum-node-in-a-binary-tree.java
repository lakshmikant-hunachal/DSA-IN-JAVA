/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int min;
    long ans = Long.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        min = root.val;
        find(root);
        return ans < Long.MAX_VALUE ? (int) ans : -1;
    }

    private void find(TreeNode p) {
        if (p != null) {
            if (p.val > min && p.val < ans) {
                ans = p.val;
            } 
            else if (p.val == min) {
                find(p.left);
                find(p.right);
            }
        }
    }
}