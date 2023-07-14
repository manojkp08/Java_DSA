package Sorting;

public class MergeSort {
    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Divide the array into two halves
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // Recursively sort the two halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0; // Index for left array
        int j = 0; // Index for right array
        int k = 0; // Index for merged array

        // Compare elements from left and right arrays and merge them in sorted order
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left array, if any
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements from right array, if any
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };
        mergeSort(array);
        System.out.println("Sorted array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
