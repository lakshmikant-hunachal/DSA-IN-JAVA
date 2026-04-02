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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int currentlevel=queue.size();
            double sum=0.0;
            for(int i=0;i<currentlevel;i++)
            {
                TreeNode currentNode=queue.poll();
                sum=sum+currentNode.val;
                if(currentNode.left!=null)
                {
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null)
                {
                    queue.offer(currentNode.right);
                }
            }
            double avg=sum/currentlevel;
            list.add(avg);
        }
        return list;
    }
}