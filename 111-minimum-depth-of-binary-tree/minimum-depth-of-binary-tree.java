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
    public int minDepth(TreeNode root) {
        int ans=0;
        if(root==null)
        {
            return 0;
        }
        /*this condition for root node contain no children */
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        //this is for left is null go to right
        if(root.left==null)
        {
            return 1+minDepth(root.right);
        }
        //this is for right is null go to left
        if(root.right==null)
        {
            return 1+minDepth(root.left);
        }
        //node conatin both children
        return 1+Math.min(minDepth(root.left),minDepth(root.right));
    }
}