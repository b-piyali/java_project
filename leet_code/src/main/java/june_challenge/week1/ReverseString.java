package june_challenge.week1;

public class ReverseString {
    public void reverseString(char[] s) {
        int j = s.length - 1;
        int i = 0;
        char temp;
        while (i < j) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
