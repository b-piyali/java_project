package online_class.tree;

import java.util.ArrayList;

public class PathGivenNode {
    public ArrayList<Integer> solve(TreeNode A, int B) {
        if (A == null) {
            return null;
        }
        ArrayList<Integer> path = new ArrayList<>();
        findPath(A, B, path);
        return path;
    }

    private boolean findPath(TreeNode node, int val, ArrayList<Integer> path) {
        if (node == null) {
            return false;
        }
        path.add(node.val);
        if (node.val == val) {
            return true;
        }
        if (findPath(node.left, val, path) || findPath(node.right, val, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }
}
