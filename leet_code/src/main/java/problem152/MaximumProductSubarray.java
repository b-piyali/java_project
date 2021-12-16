package problem152;

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        if (nums.length < 1)
            return nums[0];

        int maxProduct = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            int product = nums[i] * nums[i + 1];
            maxProduct = Integer.max(maxProduct, Integer.max(product, Integer.max(nums[i], nums[i+1])));
        }

        return maxProduct;
    }

    public static void main(String[] args) {

            System.out.println(printbr(6)+" ");
        //}
    }

    static int printbr(int n){
        if(n<=1)
            return n;
        return printbr(n-1)+printbr(n-2);
    }
}
