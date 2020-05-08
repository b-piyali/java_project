package _30_day_challenge.week2.day11;

import java.util.Objects;

/**
 * [4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2]
 */
public class DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {
        if (Objects.isNull(root))
            return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);
        int ldiameter = diameterOfBinaryTree(root.left);
        int rdiameter = diameterOfBinaryTree(root.right);
        int diameter = Math.max(ldiameter, rdiameter);
        return Math.max(lheight + rheight, diameter);
    }

    private int height(TreeNode root) {
        if (Objects.isNull(root))
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}

