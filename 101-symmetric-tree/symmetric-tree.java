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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        List<TreeNode> list = new ArrayList<>();
        list.add(root);

        while (!list.isEmpty()) {
            int size = list.size();
            List<TreeNode> level = new ArrayList<>();

            // Process current level
            for (int i = 0; i < size; i++) {
                TreeNode node = list.remove(0);

                if (node != null) {
                    level.add(node.left);
                    level.add(node.right);

                    list.add(node.left);
                    list.add(node.right);
                } else {
                    level.add(null);
                    level.add(null);
                }
            }

            // Check symmetry of this level
            int s = 0, e = level.size() - 1;
            while (s <= e) {
                TreeNode left = level.get(s);
                TreeNode right = level.get(e);

                if (left == null && right == null) {
                    // ok
                } else if (left == null || right == null) {
                    return false;
                } else if (left.val != right.val) {
                    return false;
                }

                s++;
                e--;
            }
        }

        return true;
    }
}