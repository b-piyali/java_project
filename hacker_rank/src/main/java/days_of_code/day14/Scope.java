package days_of_code.day14;

public class Scope {
    private int[] elements;
    public int maximumDifference;

    public Scope(int[] a) {
        elements = a;
    }

    public void computeDifference() {
        int max = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                int diff = Math.abs(elements[i] - elements[j]);
                if (diff > max)
                    max = diff;
            }
        }
        maximumDifference = max;
    }
}
