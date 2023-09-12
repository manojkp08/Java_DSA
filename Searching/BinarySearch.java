package Searching;

public class BinarySearch {
    public static int binarySearch(int arr[], int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Return the index of the target element
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target element not found
    }

    public static void main(String[] args) {
        int arr[] = { 11, 22, 30, 33, 40, 44, 55, 60, 66, 77, 80, 88, 99 };
        int target = 40;
        int n = arr.length;

        int result = binarySearch(arr, 0, n - 1, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
