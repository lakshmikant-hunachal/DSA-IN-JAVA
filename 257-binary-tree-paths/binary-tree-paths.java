import java.util.*;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();

        if (root == null) {
            return list; // empty list
        }

        ans(root, list, "");  // start from root
        return list;
    }

    private void ans(TreeNode p, List<String> list, String s) {
        if (p == null) {
            return;
        }

        // build path
        if (s.length() == 0) {
            s = "" + p.val;
        } else {
            s = s + "->" + p.val;
        }

        // if leaf node
        if (p.left == null && p.right == null) {
            list.add(s);
            return;
        }

        // recursive calls
        ans(p.left, list, s);
        ans(p.right, list, s);
    }
}