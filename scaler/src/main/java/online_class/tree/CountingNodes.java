package online_class.tree;

public class CountingNodes {
    private int count = 0;

    public int solve(TreeNode A) {
        return countNodes(A, Integer.MIN_VALUE);
    }

    private int countNodes(TreeNode node, int max) {
        if (node == null)
            return 0;
        if (node.val > max) {
            max = node.val;
            count++;
        }
        countNodes(node.left, max);
        countNodes(node.right, max);
        return count;
    }
}
