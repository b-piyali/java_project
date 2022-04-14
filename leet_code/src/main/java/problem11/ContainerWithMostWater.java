package problem11;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int width = right - left;
            int leftHeight = height[left];
            int reightHeight = height[right];
            int area = width * Math.min(leftHeight, reightHeight);
            max = Math.max(max, area);

            if (leftHeight < reightHeight)
                left++;
            else if (leftHeight > reightHeight)
                right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}
