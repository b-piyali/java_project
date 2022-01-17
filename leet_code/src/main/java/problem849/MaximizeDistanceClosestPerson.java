package problem849;

public class MaximizeDistanceClosestPerson {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int count = 0, maxDist = 0, last = -1;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {//for first scenario
                if (last < 0) {
                    maxDist = i;
                } else { //for second scenario
                    count = (i - last) / 2;
                    maxDist = Math.max(maxDist, count);
                }
                last = i;
            }
        }
        //for third scenario
        maxDist = Math.max(maxDist, (n - last - 1));
        return maxDist;
    }

    public int maxDistToClosest2(int[] seats) {
        int max = 0, count = 0;
        boolean seen = false;
        for (int seat : seats) {
            if (seat == 1) {
                max = seen ? Math.max(max, (count + 1) / 2) : Math.max(max, count);
                seen = true;
                count = 0;
            } else {
                count++;
            }
        }
        return Math.max(count, max);
    }
}
