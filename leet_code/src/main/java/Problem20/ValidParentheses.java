package Problem20;
// created by: bandypiy
// Date: 10/15/2018

import java.util.Objects;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (Objects.isNull(s) || (s.charAt(0) != '(' && s.charAt(0) != '{'&& s.charAt(0) != '['))
            return false;

        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                count++;
            } else if (stack.size() > 0 &&
                    ((c == ')' && '(' == stack.peek()) ||
                            (c == '}' && '{' == stack.peek()) ||
                            (c == ']' && '[' == stack.peek()))) {
                stack.pop();
                count--;
            } else {
                count++;
            }
        }
        return (stack.size() == 0 && count == 0);
    }

    /*public static void main(String[] args) {
        String input = "{([)]}";
        System.out.println(isValid(input));
    }*/
}
