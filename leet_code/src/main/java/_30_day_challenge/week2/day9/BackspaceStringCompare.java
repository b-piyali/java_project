package _30_day_challenge.week2.day9;

import java.util.Stack;

/**
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 *
 * Example 1:
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 *
 * Example 2:
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 *
 */

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();

        buildStack(S, sStack);
        buildStack(T, tStack);

        while (!sStack.isEmpty()) {
            char current = sStack.pop();
            if (tStack.isEmpty() || tStack.pop() != current)
                return false;
        }

        return tStack.isEmpty();

        //return returnBackSpaceString(S).equals(returnBackSpaceString(T));
    }

    private void buildStack(String str, Stack<Character> strStack) {
        for (char ch : str.toCharArray()) {
            if (ch != '#')
                strStack.push(ch);
            else if (!strStack.isEmpty())
                strStack.pop();
        }
    }

    private String returnBackSpaceString(String str) {
        Stack<Character> strStack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch != '#')
                strStack.push(ch);
            else if (!strStack.isEmpty())
                strStack.pop();
        }
        return String.valueOf(strStack);
    }

}
