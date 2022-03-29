package online_class.subsequences_subsets;

public class LittlePonny2Subsequence {
    public String solve(String A) {
        char firstMinChar = 'z';
        char secondMinChar = 'z';
        int index = 0;
        for (int i = 0; i < A.length() - 1; ++i) {
            if (A.charAt(i) < firstMinChar) {
                firstMinChar = A.charAt(i);
                index = i;
            }
        }

        for (int i = index + 1; i < A.length(); ++i) {
            if (A.charAt(i) < secondMinChar) {
                secondMinChar = A.charAt(i);
            }
        }
        //String result = String.valueOf(firstMinChar + secondMinChar);
        return String.valueOf("" + firstMinChar + secondMinChar);
    }
}
