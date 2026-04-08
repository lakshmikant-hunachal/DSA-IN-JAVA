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
    public int maxLevelSum(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null)
        {
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int sum=0;
            int level=queue.size();
            for(int i=0;i<level;i++)
            {
                TreeNode node=queue.poll();
                sum=sum+node.val;
                if(node.left != null)
                {
                    queue.offer(node.left);
                }
                if(node.right != null)
                {
                    queue.offer(node.right);
                }
            }
            list.add(sum);
        }
        int ans=0;
        int max=list.get(0);
        for(int i=1;i<list.size();i++)
        {
            if(max < list.get(i))
            {
                ans = i;
                max = list.get(i);
            }
        }
        return ans+1;
    }
}