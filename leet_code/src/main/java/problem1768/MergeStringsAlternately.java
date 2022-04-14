package problem1768;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int word1Len = word1.length();
        int word2Len = word2.length();
        int len = Math.max(word1Len, word2Len);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (word1Len <= len) {
                str.append(word1.charAt(i));
            }
            if (word2Len <= len) {
                str.append(word2.charAt(i));
            }
        }
        return str.toString();
    }
}
