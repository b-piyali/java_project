package may.week1.day7;

public class CousinsBinaryTree {

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null)
            return false;
        if (getHeight(root, x, 1) != getHeight(root, y, 1))
            return false;
        else {
            if (sameParents(root, x, y)) {
                return false;
            } else {
                return true;
            }
        }
    }

    private boolean sameParents(TreeNode root, int x, int y) {
        if (root == null)
            return false;
        if(root.left !=null && root.right !=null)
            return ((root.left.val == x && root.right.val == y)
                    || (root.left.val == y && root.right.val == x));
        return (sameParents(root.left, x, y) || sameParents(root.right, x, y));
    }

    private int getHeight(TreeNode root, int x, int height) {
        if (root == null)
            return 0;
        if (root.val == x)
            return height;

        int level = getHeight(root.left, x, height + 1);
        if (level != 0)
            return level;
        return getHeight(root.right, x, height + 1);
    }


    public static void main(String[] args) throws java.lang.Exception {
        TreeNode root = new TreeNode(1);
        TreeNode x1 = new TreeNode(2);
        TreeNode y1 = new TreeNode(3);
        root.left = x1;
        root.right = y1;
        root.right.left = new TreeNode(4);
        /*root.right.left = new TreeNode(4);
        TreeNode x2 = new TreeNode();
        TreeNode y2 = new TreeNode(5);
        //root.right.left.left = new TreeNode(8);
        root.right.left.right = y2;
        root.left.left.left = x2;*/

        CousinsBinaryTree i = new CousinsBinaryTree();
        System.out.println("Node " + 4 + " and Node " + 3 + " are cousins??? " + i.isCousins(root, 4, 3));
        //System.out.println("Node " + x2.val + " and Node " + y2.val + " are cousins??? " + i.isCousins(root, x2, y2));
    }
}
