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
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> sublist = new ArrayList<>();

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        preorder(root, list);
        preorder(subRoot, sublist);

        return contains(list, sublist);
    }

    private void preorder(TreeNode root, ArrayList<Integer> l) {
        if (root == null) {
            l.add(null);   // null marker to preserve structure
            return;
        }

        l.add(root.val);
        preorder(root.left, l);
        preorder(root.right, l);
    }

    private boolean contains(ArrayList<Integer> list, ArrayList<Integer> sublist) {
        int n = list.size();
        int m = sublist.size();

        if (m > n) return false;

        for (int i = 0; i <= n - m; i++) {
            boolean found = true;

            for (int j = 0; j < m; j++) {
                // Use Objects.equals() to safely compare null values
                if (!Objects.equals(list.get(i + j), sublist.get(j))) {
                    found = false;
                    break;
                }
            }

            if (found) return true;
        }

        return false;
    }
}