package _30_day_challenge.week2.day11;

public class DiameterOfBinaryTree_2 {
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return diameter;
    }

    int diameter(TreeNode node) {
        if (node == null)
            return 0;
        int left = diameter(node.left);
        int right = diameter(node.right);
        diameter = Math.max(diameter, left + right);
        return Math.max(left, right) + 1;
    }
}
