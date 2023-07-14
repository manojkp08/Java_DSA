package Hashing;

import java.util.HashMap;

class SubarraySumEqualsZero {
    public static int subarraySum(int[] nums) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum)) {
                count += map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, -3, -1, 0, 4 };
        int subarrayCount = subarraySum(nums);
        System.out.println("Subarray Count: " + subarrayCount);
    }
}
// Time Complexity: O(n) - where n is the number of elements in the array
// Best Case Time Complexity: O(1) - when the array does not contain any
// subarray sum equal to zero
