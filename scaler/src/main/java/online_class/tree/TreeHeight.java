package online_class.tree;

public class TreeHeight {
    public int solve(TreeNode A) {
        if(A == null) {
            return 0;
        }
        return Math.max(solve(A.left), solve(A.right)) + 1;
    }
}
