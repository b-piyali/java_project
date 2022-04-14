package problem700;

import tree_node.TreeNode;

public class SearchBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val)
            return root;
        while (root != null && root.val != val)
            root = val < root.val ? root.left : root.right;
        return root;
    }

    public TreeNode searchBST2(TreeNode root, int val) {
        if (root == null || root.val == val)
            return root;
        if (val < root.val)
            return searchBST(root.left, val);
        return searchBST(root.right, val);
    }
}
