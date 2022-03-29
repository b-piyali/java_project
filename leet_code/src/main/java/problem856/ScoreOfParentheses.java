package problem856;

import java.util.Objects;
import java.util.Stack;

public class ScoreOfParentheses {
    public int scoreOfParentheses(String s) {
        if (Objects.isNull(s))
            return 0;
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(count);
                count = 0;
            } else {
                count = stack.pop() + Math.max(2 * count, 1);
            }
        }
        return count;
    }
}
