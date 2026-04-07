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
    List<Integer> list=new ArrayList<>();

    public int minDiffInBST(TreeNode root) {
        find(root);
        long diff=Long.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++)
        {
           int ans=Math.abs(list.get(i)-list.get(i+1));
            if(diff>ans)
            {
                diff=ans;
            }
        }
        return (int)diff;
    }
    private void find(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        find(root.left);
        list.add(root.val);
        find(root.right);

    }
}