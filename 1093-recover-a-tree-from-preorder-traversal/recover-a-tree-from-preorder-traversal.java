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
    int index = 0;

    public TreeNode recoverFromPreorder(String traversal) {
        return buildTree(traversal, 0);
    }

    private TreeNode buildTree(String s, int depth) {
        int n = s.length();
        int dashCount = 0;
        int tempIndex = index;

        // Count dashes
        while (tempIndex < n && s.charAt(tempIndex) == '-') {
            dashCount++;
            tempIndex++;
        }

        // If depth doesn't match, return null
        if (dashCount != depth) {
            return null;
        }

        // Move actual index
        index = tempIndex;

        // Read node value (handles multiple digits)
        int value = 0;
        while (index < n && Character.isDigit(s.charAt(index))) {
            value = value * 10 + (s.charAt(index) - '0');
            index++;
        }

        // Create node
        TreeNode root = new TreeNode(value);

        // Build left and right subtrees
        root.left = buildTree(s, depth + 1);
        root.right = buildTree(s, depth + 1);

        return root;
    }
}