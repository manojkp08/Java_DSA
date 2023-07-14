package Hashing;

import java.util.HashSet;

class UnionOfArrays {
    public static int union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 4, 5, 6, 7, 8 };
        int unionSize = union(arr1, arr2);
        System.out.println("Union Size: " + unionSize);
    }
}
// Time Complexity: O(m + n) - where m and n are the number of elements in the
// two arrays
// Best Case Time Complexity: O(min(m, n)) - when there are no common elements
// between the two arrays
