package Hashing;

import java.util.HashMap;

class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majorityCount = nums.length / 2;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > majorityCount) {
                return num;
            }
        }
        return -1; // No majority element found
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int majorityElement = majorityElement(nums);
        System.out.println("Majority Element: " + majorityElement);
    }
}
// Time Complexity: O(n) - where n is the number of elements in the array
// Best Case Time Complexity: O(1) - when the majority element is the first
// element in the array
