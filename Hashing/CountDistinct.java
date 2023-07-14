package Hashing;

import java.util.HashMap;

class CountDistinctElements {
    public static int countDistinctElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.size();
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 1, 2, 3 };
        int distinctCount = countDistinctElements(nums);
        System.out.println("Distinct Elements Count: " + distinctCount);
    }
}
// Time Complexity: O(n) - where n is the number of elements in the array
// Best Case Time Complexity: O(1) - when all elements in the array are the same
