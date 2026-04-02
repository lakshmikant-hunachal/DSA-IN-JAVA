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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // Result list to store final answer
        List<List<Integer>> list = new ArrayList<>();
        
        // Edge case: if tree is empty
        if (root == null) {
            return list;
        }

        // Deque is used to allow insertion/removal from both ends
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // Flag to control direction (left->right or right->left)
        boolean reverse = false;

        // Traverse until queue becomes empty
        while (!queue.isEmpty()) {

            // Number of nodes in current level
            int currentsize = queue.size();

            // List to store current level values
            List<Integer> inner = new ArrayList<>();

            // Normal order (left to right)
            if (!reverse) {
                for (int i = 0; i < currentsize; i++) {

                    // Remove node from front
                    TreeNode currentNode = queue.pollFirst();

                    // Add value to current level list
                    inner.add(currentNode.val);

                    // Add children to the back of deque
                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }
                }
            }
            // Reverse order (right to left)
            else {
                for (int i = 0; i < currentsize; i++) {

                    // Remove node from back
                    TreeNode currentNode = queue.pollLast();

                    // Add value to current level list
                    inner.add(currentNode.val);

                    // Add children to the front (reverse order)
                    if (currentNode.right != null) {
                        queue.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        queue.addFirst(currentNode.left);
                    }
                }
            }

            // ✅ Add current level result to final list (IMPORTANT FIX)
            list.add(inner);

            // Toggle direction for next level
            reverse = !reverse;
        }

        // Return final zigzag traversal
        return list;
    }
}