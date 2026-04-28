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
    public boolean isUnivalTree(TreeNode root) {
        order(root);
        Collections.sort(list);
        if(list.get(0)==list.get(list.size()-1))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    private void order(TreeNode p)
    {
        if(p==null)
        {
            return;
        }
        list.add(p.val);
        order(p.left);
        order(p.right);
    }
}