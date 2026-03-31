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
    ArrayList<Integer> list=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
        {
            return -1;
        }
       inorder(root);
       return list.get(k-1);
    }
    private void inorder(TreeNode p)
    {
        if(p==null)
        {
            return;
        }
        inorder(p.left);
        list.add(p.val);
        inorder(p.right);

    }
}