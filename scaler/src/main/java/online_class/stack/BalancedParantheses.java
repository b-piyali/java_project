package online_class.stack;

import java.util.Stack;

public class BalancedParantheses {
    public int solve(String A) {
        if(A.charAt(0) != '(') {
            return 0;
        }
        Stack<Character> st = new Stack<>();
        for (char ch : A.toCharArray()) {
            if (st.isEmpty() || ch == st.peek()) {
                st.push(ch);
            } else {
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
