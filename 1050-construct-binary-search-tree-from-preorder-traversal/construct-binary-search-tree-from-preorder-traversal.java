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
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0)
        {
            return null;
        }
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++)
        {
            find(preorder[i],root);
        }
        return root;
    }
    private TreeNode find(int value,TreeNode p)
    {
        if(p==null)
        {
            TreeNode node =new TreeNode(value);
            return node;
        }
        if(p.val>value)
        {
            p.left=find(value,p.left);
        }
         if(p.val<value)
        {
            p.right=find(value,p.right);
        }
        return p;
    }
}