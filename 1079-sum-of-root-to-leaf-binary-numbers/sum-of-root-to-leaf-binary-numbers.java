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
    int pow=1;
    public int sumRootToLeaf(TreeNode root) {
       return preorder(root,0);
    }
    private int  preorder(TreeNode root,int subsum)
    {
        if(root==null)
        {
            return 0;
        }
        subsum=subsum*2+root.val;
        if(root.left == null && root.right == null)
        {
            return subsum;
        }
        return preorder(root.left,subsum)+
        preorder(root.right,subsum);
    }
}