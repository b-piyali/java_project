package online_class.subsequences_subsets;

public class SpecialSubsequencesAG {
    public int solve(String A) {
        int subCount = 0;
        int aCount = 0;
        int gCount = 0;
        for (char ch : A.toCharArray()) {
            if (ch == 'A') {
                aCount++;
            } else if (ch == 'G') {
                gCount++;
                if (aCount == 1) {
                    subCount = gCount;
                } else {
                    subCount += aCount;
                }
            }
        }
        return subCount;
    }
}
