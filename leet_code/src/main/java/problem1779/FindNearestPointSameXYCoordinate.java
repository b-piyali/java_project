package problem1779;

public class FindNearestPointSameXYCoordinate {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDistance = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < points.length; i++) {
            int a = points[i][0], b = points[i][1];
            if (a == x || b == y) {
                int sum = Math.abs(x - a) + Math.abs(y - b);
                if (minDistance > sum) {
                    minDistance = sum;
                    minIndex = i;
                }
            }
        }
        return minIndex;
    }
}
