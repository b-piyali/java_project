package online_class.class_work;

public class GreaterThanItself {
    public int getCount(int[] n) {
        int count = 0;
        int maxVal = n[0];
        for (int j : n) {
            maxVal = Math.max(maxVal, j);
        }
        for (int j : n) {
            if (j < maxVal)
                count++;
        }
        return count;
    }
}
