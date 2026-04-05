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
    public boolean isCousins(TreeNode root, int x, int y) {
        return !isSibling(root, x, y) && 
               (level(root, x, 0) == level(root, y, 0));
    }

    private boolean isSibling(TreeNode root, int x, int y) {
        if (root == null) return false;

        return (
            (root.left != null && root.right != null &&
             ((root.left.val == x && root.right.val == y) ||
              (root.left.val == y && root.right.val == x))) ||
            isSibling(root.left, x, y) ||
            isSibling(root.right, x, y)
        );
    }

    private int level(TreeNode root, int x, int lev) {
        if (root == null) return 0;

        if (root.val == x) return lev;

        int l = level(root.left, x, lev + 1);
        if (l != 0) return l;

        return level(root.right, x, lev + 1);
    }
}