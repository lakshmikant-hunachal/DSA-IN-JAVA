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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return range(root, low, high);
    }

    private int range(TreeNode p, int low, int high) {
        if (p == null) {
            return 0;
        }

        int sum = 0;

        if (p.val >= low && p.val <= high) {
            sum += p.val;
        }

        sum += range(p.left, low, high);
        sum += range(p.right, low, high);

        return sum;
    }
}