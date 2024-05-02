package PLA;

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = currentMax;
            currentMax = Math.max(nums[i], Math.max(nums[i] * currentMax, nums[i] * currentMin));
            currentMin = Math.min(nums[i], Math.min(nums[i] * temp, nums[i] * currentMin));
            maxProduct = Math.max(maxProduct, currentMax);
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, -2, 4 };
        System.out.println(maxProduct(arr));
    }
}
