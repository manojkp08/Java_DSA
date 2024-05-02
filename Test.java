// Now we will se an interesting code.
// We will solve the problem "Longest Subsequence of 1's after flipping 0's".

// Problem: Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
import java.util.*;

public class Test {
    public static int findMaxLength(int[] nums) {
        int n = nums.length;
        int max = 0;
        int sum = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                sum--;
            } else {
                sum++;
            }
            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return max;
    }

    public static void main(String args[]) {
        int[] nums = { 0, 1, 1, 0, 0, 0 };
        int max_length = findMaxLength(nums);
        System.out.println(max_length);
    }
}