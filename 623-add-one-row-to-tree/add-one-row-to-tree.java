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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root==null)
        {
            return null;
        }
        if(depth==1)
        {
            TreeNode node =new TreeNode(val);
            node.left = root;
            return node;
        }
         Queue<TreeNode> queue=new LinkedList<>();
         queue.offer(root);
          int count=1;
         while(!queue.isEmpty())
         {
            int size = queue.size();
            if(count==depth-1)
            {
                for(int i=0;i<size;i++)
                {
                    TreeNode node =queue.poll();
                    TreeNode left=node.left;
                    TreeNode right=node.right;
                    node.left = new TreeNode(val);
                    node.right = new TreeNode(val);
                    node.left.left=left;
                    node.right.right=right;
                }
                break;
            }
            for(int i=0;i<size;i++)
            {
                 
                TreeNode temp = queue.poll();
                if(temp.left!=null)
                {
                    queue.offer(temp.left);
                }
                if(temp.right!=null)
                {
                    queue.offer(temp.right);
                }
            }
            count++;
         }
         return root;
    }
    
}