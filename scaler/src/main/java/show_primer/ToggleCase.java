package show_primer;

public class ToggleCase {
    public String solve(String A) {
        StringBuilder str = new StringBuilder();
        for (char ch : A.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
                str.append(ch);
            } else if (ch >= 'a' && ch <= 'z') {
                ch -= 32;
                str.append(ch);
            }
        }
        return str.toString();
    }
}
