package online_class.tree;

import java.util.ArrayList;

public class InorderTraversal {
    private static ArrayList<Integer> result = new ArrayList<>();

    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        if (A == null) {
            return null;
        }
        inorderTraversal(A.left);
        result.add(A.val);
        inorderTraversal(A.right);
        return result;
    }
}
