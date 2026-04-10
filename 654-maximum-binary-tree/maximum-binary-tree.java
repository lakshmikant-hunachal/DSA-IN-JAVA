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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
       return create(nums,0,nums.length-1);
    }
    private TreeNode create(int[] arr,int s,int e)
    {
        if(s>e)
        return null;
        int ele=max(arr,s,e);
        TreeNode root=new TreeNode(arr[ele]);
        root.left=create(arr,s,ele-1);
        root.right=create(arr,ele+1,e);
        return root;
    }
    private int max(int[] A,int s,int e)
    {
        int ans=A[s];
        int m=s;
        for(int i=s+1;i<=e;i++)
        {
            if(ans<A[i])
            {
                ans=A[i];
                m=i;
            }
        }
        return m;
    }
}