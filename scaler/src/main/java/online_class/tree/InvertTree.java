package online_class.tree;

public class InvertTree {
    public void invertTree(TreeNode node) {
        if(node == null)
            return;
        invertTree(node.left);
        invertTree(node.right);
        TreeNode tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;
    }
}
