package online_class.tree;

public class BSTNodesAange {
    private int count = 0;

    public int solve(TreeNode A, int B, int C) {
        if (A == null) {
            return 0;
        }
        if ((A.val >= B) && (A.val <= C))
            count++;
        solve(A.left, B, C);
        solve(A.right, B, C);
        return count;
    }
}
