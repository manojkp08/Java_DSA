package Searching;

public class LinearSearch {
    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target element
            }
        }
        return -1; // Target element not found
    }

    public static void main(String[] args) {
        int arr[] = { 11, 22, 30, 33, 40, 44, 55, 60, 66, 77, 80, 88, 99 };
        int target = 40;

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
