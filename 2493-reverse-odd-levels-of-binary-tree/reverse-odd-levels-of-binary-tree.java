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
    public TreeNode reverseOddLevels(TreeNode root) {
       dfs(root.left,root.right,1);
       return root;
    }
    private void dfs(TreeNode left,TreeNode right,int level)
    {
        if(left == null || right == null)
        {
            return;
        }
        if(level%2==1)
        {
            int temp=left.val;
            left.val=right.val;
            right.val=temp;
        }
        dfs(left.left,right.right,level+1);
        /*take last element of the tree left side also right side of the tree and this process is continue*/
        dfs(left.right,right.left,level+1);
        /*here only swap the value of the node not node therefore use mirror approch*/
    }
}