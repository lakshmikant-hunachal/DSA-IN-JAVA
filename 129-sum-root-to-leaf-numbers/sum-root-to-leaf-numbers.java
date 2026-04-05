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
    public int sumNumbers(TreeNode root) {
        List<String> list = new ArrayList<>();
        
        if (root == null) return 0;

        find(root, list, "");

        int sum = 0;
        for (String s : list) {
            if (!s.isEmpty()) {
                sum += Integer.parseInt(s);
            }
        }
        return sum;
    }

    private void find(TreeNode root, List<String> list, String s) {
        if (root == null) return;

        s = s + root.val;

        // ✅ leaf node
        if (root.left == null && root.right == null) {
            list.add(s);
            return;
        }

        find(root.left, list, s);
        find(root.right, list, s);
    }
}