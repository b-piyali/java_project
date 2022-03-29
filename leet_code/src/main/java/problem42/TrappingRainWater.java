package problem42;

public class TrappingRainWater {
    public int trap(int[] height) {
        int count = 0;
        int maxLeft = height[0];
        int len = height.length;
        int maxRight = height[len-1];
        int maxIndex = 0;
        int maxNum = height[0];

        for (int i = 1; i < len; ++i) {
            if (height[i] > maxNum) {
                maxIndex = i;
                maxNum = height[i];
            }
        }

        for (int i = 1; i < maxIndex; ++i) {
            maxLeft = Math.max(maxLeft, height[i]);
            if (maxLeft > height[i])
                count += maxLeft - height[i];
        }

        for (int i = len - 2; i > maxIndex; --i) {
            maxRight = Math.max(maxRight, height[i]);
            if (maxRight > height[i])
                count += maxRight - height[i];
        }
        return count;
    }

    public int trap3(int[] height) {
        int count = 0;
        int maxLeft = height[0];
        int len = height.length;
        int[] suffixMax = new int[len];
        suffixMax[len - 1] = height[len - 1];
        for (int i = len - 2; i > 0; --i) {
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]);
        }

        for (int i = 0; i < len; ++i) {
            maxLeft = Math.max(maxLeft, height[i]);
            int support = Math.min(maxLeft, suffixMax[i]);
            if (support <= height[i])
                count += 0;
            else
                count += support - height[i];
        }
        return count;
    }

    public int trap2(int[] height) {
        int count = 0;
        int len = height.length;
        int[] preMax = new int[len];
        int[] suffixMax = new int[len];
        preMax[0] = height[0];
        suffixMax[len - 1] = height[len - 1];

        for (int i = 1; i < len; ++i) {
            preMax[i] = Math.max(preMax[i - 1], height[i]);
        }

        for (int i = len - 2; i > 0; --i) {
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]);
        }

        for (int i = 0; i < len; ++i) {
            int support = Math.min(preMax[i], suffixMax[i]);
            if (support <= height[i])
                count += 0;
            else
                count += support - height[i];
        }
        return count;
    }

    public int trap1(int[] height) {
        int count = 0;
        for (int i = 0; i < height.length; ++i) {
            int maxLeft = 0;
            for (int j = 0; j <= i; ++j) {
                maxLeft = Math.max(maxLeft, height[j]);
            }
            int maxRight = 0;
            for (int j = height.length - 1; j >= i; --j) {
                maxRight = Math.max(maxRight, height[j]);
            }
            int support = Math.min(maxLeft, maxRight);
            if (support <= height[i])
                count += 0;
            else
                count += support - height[i];
        }
        return count;
    }
}
