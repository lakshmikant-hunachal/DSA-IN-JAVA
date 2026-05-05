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
    int currentVal = 0;
    int currentCount = 0;
    int maxCount = 0;
    ArrayList<Integer> modes = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inorder(root);

        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }
        return result;
    }

    private void handleValue(int val) {
        if (val != currentVal) {
            currentVal = val;
            currentCount = 0;
        }

        currentCount++;

        if (currentCount > maxCount) {
            maxCount = currentCount;
            modes.clear();
            modes.add(val);
        } else if (currentCount == maxCount) {
            modes.add(val);
        }
    }

    private void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        handleValue(root.val);
        inorder(root.right);
    }
}