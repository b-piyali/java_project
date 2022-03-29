package online_class.tree;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode A) {
        if (A == null) {
            return null;
        }
        invertTree(A.left);
        invertTree(A.right);
        TreeNode temp = A.left;
        A.left = A.right;
        A.right = temp;
        return A;
    }
}
