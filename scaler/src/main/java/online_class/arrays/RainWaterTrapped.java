package online_class.arrays;

import java.util.List;

public class RainWaterTrapped {
    public int trap(final List<Integer> A) {
        int waterTraped = 0;
        int height = A.get(0);
        int maxIndex = 0;
        for (int i = 1; i < A.size(); i++) {// finding Max height Index
            if (height < A.get(i)) {
                height = A.get(i);
                maxIndex = i;
            }
        }

        // for left side buildings from max height building
        int maxLeft = A.get(0);
        for (int i = 1; i < maxIndex; i++) {
            height = A.get(i);
            maxLeft = Math.max(maxLeft, height);
            if (maxLeft > height)
                waterTraped += maxLeft - height;
        }

        // for right side buildings from max height building
        int maxRight = A.get(A.size() - 1);
        for (int i = A.size() - 2; i > maxIndex; i--) {
            height = A.get(i);
            maxRight = Math.max(maxRight, height);
            if (maxRight > height)
                waterTraped += maxRight - height;
        }

        return waterTraped;
    }
}
