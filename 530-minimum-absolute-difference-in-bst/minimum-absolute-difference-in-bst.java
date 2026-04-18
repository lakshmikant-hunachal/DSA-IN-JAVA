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
     ArrayList<Integer> diff=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        preorder(root);
        for(int i=0;i<list.size()-1;i++)
        {
            diff.add(Math.abs(list.get(i)-list.get(i+1)));
        }
        int min=diff.get(0);
        for(int i=1;i<diff.size();i++)
        {
            min=Math.min(diff.get(i),min);
        }
        return min;
    }
    private void preorder(TreeNode p)
    {
        if(p==null)
        {
            return;
        }
        preorder(p.left);
        list.add(p.val);
        preorder(p.right);
    }
}