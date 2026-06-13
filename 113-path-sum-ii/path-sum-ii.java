class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        find(root, targetSum, new ArrayList<>());
        return result;
    }

    private void find(TreeNode root, int sum, List<Integer> list) {
        if (root == null) {
            return;
        }

        list.add(root.val);

        // Leaf node and target achieved
        if (root.left == null && root.right == null && sum == root.val) {
            result.add(new ArrayList<>(list));
        } else {
            find(root.left, sum - root.val, list);
            find(root.right, sum - root.val, list);
        }

        // Backtracking
        list.remove(list.size() - 1);
    }
}