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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean seen = false;
        while(!queue.isEmpty())
        {
            TreeNode node = queue.poll();
            if( node == null)
            {
                seen = true; /*when assume last node is null then queue is empty can not 
                this loop next time but any condision middle null is accur return false due to that tree is not complete binary tree*/
            }
            else
            {
                if(seen)
                {
                    return false;
                }
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
       return true;
    }
}