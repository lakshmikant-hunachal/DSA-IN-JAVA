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
    List<Integer>list =new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
       Add(root);
       if(k>list.size())
       {
        return -1;
       }
       return list.get(k-1);
    }
    private void Add(TreeNode root)
    {
        if(root==null)
        {
           return;
        }
        Add(root.left);
        list.add(root.val);
        Add(root.right);

    }
}