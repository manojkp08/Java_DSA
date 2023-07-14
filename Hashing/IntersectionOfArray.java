package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class IntersectionOfArrays {
    public static List<Integer> intersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : arr2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 1 };
        int[] arr2 = { 2, 2 };
        List<Integer> intersectionList = intersection(arr1, arr2);
        System.out.println("Intersection: " + intersectionList);
    }
}
// Time Complexity: O(m + n) - where m and n are the number of elements in the
// two arrays
// Best Case Time Complexity: O(min(m, n)) - when there are no common elements
// between the two arrays
