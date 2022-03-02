package online_class.stack;

import java.util.Stack;

public class BalancedParanthesisII {

    public int solve(String A) {
        /*if ((A.charAt(0) != '(') || (A.charAt(0) != '{') || (A.charAt(0) != '[')) {
            return 0;
        }*/
        Stack<Character> st = new Stack<>();
        for (char ch : A.toCharArray()) {
            if (st.isEmpty() || ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if ((st.peek() == '(' && ch == ')') ||
                    (st.peek() == '{' && ch == '}') ||
                    (st.peek() == '[' && ch == ']')) {
                st.pop();
            }
        }
        if (st.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
}
