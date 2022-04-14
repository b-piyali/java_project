package problem589;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {
    List<Integer> ans = new ArrayList();

    public List<Integer> preorder(Node root) {
        if (root != null) {
            ans.add(root.val);
            for (Node node : root.children) {
                preorder(node);
            }
        }
        return ans;
    }
}
