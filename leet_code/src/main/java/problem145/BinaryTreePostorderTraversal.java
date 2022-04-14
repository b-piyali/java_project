package problem145;

import tree_node.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> outPut = new ArrayList<>();
        postorderTraversal(root, outPut);
        return outPut;
    }

    public void postorderTraversal(TreeNode root, List<Integer> output) {
        if (root == null)
            return;

        postorderTraversal(root.left, output);
        postorderTraversal(root.right, output);
        output.add(root.val);
    }
}
