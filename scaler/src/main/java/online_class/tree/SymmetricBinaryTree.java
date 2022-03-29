package online_class.tree;

public class SymmetricBinaryTree {
    public int isSymmetric(TreeNode A) {
        if (A == null)
            return 1;
        if (A.left == null && A.right == null)
            return 1;
        if (A.left == null || A.right == null)
            return 0;
        if (A.left.val == A.right.val)
            return 1;

        if (isSymmetric(A.left) == 1 &&
                isSymmetric(A.right) == 1) {
            return 1;
        }
        return 0;
    }
}
