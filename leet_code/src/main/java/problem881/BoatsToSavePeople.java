package problem881;

import java.util.Arrays;
import java.util.Objects;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        if (Objects.isNull(people))
            return 0;
        Arrays.sort(people);
        int numBots = 0;
        int i = 0;
        int j = people.length - 1;
        while (i <= j) {
            numBots++;
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
        }
        return numBots;
    }
}
