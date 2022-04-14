package problem94;

import tree_node.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> outPut = new ArrayList<>();
        inorderTraversal(root, outPut);
        return outPut;
    }

    public void inorderTraversal(TreeNode root, List<Integer> output) {
        if (root == null)
            return;

        inorderTraversal(root.left, output);
        output.add(root.val);
        inorderTraversal(root.right, output);
    }
}
