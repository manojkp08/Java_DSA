package Sorting;

public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array
            int pivotIndex = partition(array, low, high);

            // Recursively sort the sub-arrays before and after the pivot
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        // Choose the rightmost element as the pivot
        int pivot = array[high];

        // Index of the smaller element
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] (or the pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the pivot index
        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = { 64, 34, 25, 12, 22, 11, 90 };
        int low = 0;
        int high = array.length - 1;
        quickSort(array, low, high);
        System.out.println("Sorted array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
