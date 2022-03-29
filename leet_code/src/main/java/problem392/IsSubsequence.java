package problem392;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        //for(char ch: s.toCharArray()) {
        return t.contains(s);
        //}
    }
}
