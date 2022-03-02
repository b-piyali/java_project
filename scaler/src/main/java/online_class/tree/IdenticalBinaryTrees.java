package online_class.tree;

public class IdenticalBinaryTrees {
    public int isSameTree(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            if (A == null && B == null) {
                return 1;
            } else {
                return 0;
            }
        }

        return isSameTree(A.left, B.left) & isSameTree(A.right, B.right) & ((A.val == B.val) ? 1 : 0);
    }
}
