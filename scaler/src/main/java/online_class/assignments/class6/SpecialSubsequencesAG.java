package online_class.assignments.class6;

public class SpecialSubsequencesAG {
    public int solve(String A) {
        int aCount = 0;
        int gCount = 0;
        for (char ch : A.toCharArray()) {
            if (ch == 'A') {
                aCount++;
            } else if (ch == 'G') {
                gCount += aCount;
            }
        }
        return gCount;
    }
}
