package problem1094;

public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] car = new int[1001];
        for (int[] trip : trips) {
            car[trip[1]] += trip[0];
            car[trip[2]] -= trip[0];
        }
        int passengers = 0;
        for (int p : car) {
            passengers += p;
            if (passengers > capacity)
                return false;
        }
        return true;
    }
}
