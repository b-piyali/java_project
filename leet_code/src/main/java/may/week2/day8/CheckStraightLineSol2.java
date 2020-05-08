package may.week2.day8;

public class CheckStraightLineSol2 {
    public boolean checkStraightLine(int[][] coordinates) {
        int length = coordinates.length - 1, i;

        double slope = (double) (coordinates[1][1] - coordinates[0][1]) / (double) (coordinates[1][0] - coordinates[0][0]);

        for (i = 1; i < length; i++) {
            double tSlope = (double) (coordinates[i + 1][1] - coordinates[i][1]) / (double) (coordinates[i + 1][0] - coordinates[i][0]);
            if (slope != tSlope) {
                return false;
            }
        }
        return true;
    }
}
