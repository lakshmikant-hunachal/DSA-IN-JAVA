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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            List<Integer> currentlevel=new ArrayList<>();
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++)
            {
                TreeNode currentNode=queue.poll();
                currentlevel.add(currentNode.val);
                if(currentNode.left!=null)
                {
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null)
                {
                    queue.offer(currentNode.right);
                }
            }
            list.add(currentlevel);
        }
        return list;
    }
}