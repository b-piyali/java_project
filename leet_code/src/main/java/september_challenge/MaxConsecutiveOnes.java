package september_challenge;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int count = 0;
        for (int n : nums) {
            if (n == 0) {
                maxOnes = Math.max(maxOnes, count);
                count = 0;
            } else if (n == 1) {
                count++;
            }
        }

        return Math.max(maxOnes, count);
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        int maxOnes = findMaxConsecutiveOnes(nums);
        System.out.println(maxOnes);
    }
}
