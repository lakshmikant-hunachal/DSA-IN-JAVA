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
    int count = 0;

    public int minCameraCover(TreeNode root) {
        if (solve(root) == 0) {
            count++;
        }
        return count;
    }

    // 0 = node needs camera
    // 1 = node has camera
    // 2 = node is covered
    public int solve(TreeNode root) {
        if (root == null) {
            return 2;
        }

        int left = solve(root.left);
        int right = solve(root.right);

        if (left == 0 || right == 0) {
            count++;
            return 1;
        }

        if (left == 1 || right == 1) {
            return 2;
        }

        return 0;
    }
}