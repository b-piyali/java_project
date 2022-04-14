package problem144;

import tree_node.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        preorderTraversal(root, output);
        return output;
    }

    public void preorderTraversal(TreeNode root, List<Integer> output) {
        if (root == null)
            return;
        output.add(root.val);
        preorderTraversal(root.left, output);
        preorderTraversal(root.right, output);
    }
}
