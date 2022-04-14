package problem701;

import tree_node.TreeNode;

import java.util.Objects;

public class InsertBinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (Objects.isNull(root)) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
            return root;
        } else {
            root.right = insertIntoBST(root.right, val);
            return root;
        }
    }
}
