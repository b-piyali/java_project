package problem1022;

public class SumRootToLeafBinaryNumbers {
    public int ans = 0;

    public void search(TreeNode node, int pre) {
        if (node.left == null && node.right == null) // node is a leaf node, return the sum of path from root to node
            // this.ans += pre << 1 | node.val; // also work
            this.ans += pre * 2 + node.val;

        if (node.left != null) // node.left is not None, recursively find the sum node to leaf
            // search(node.left, pre << 1 | node.val); // also work
            search(node.left, pre * 2 + node.val);

        if (node.right != null) // node.right is not None, recursively find the sum node to leaf
            // search(node.right, pre << 1 | node.val); // also work
            search(node.right, pre * 2 + node.val);
    }

    public int sumRootToLeaf(TreeNode root) {
        search(root, 0);
        return this.ans;
    }
}
