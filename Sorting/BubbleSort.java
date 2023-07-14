package Sorting;

public class BubbleSort {
    // Best case - Time Complexity is O(n).
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                // If no two elements were swapped, the array is already sorted
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 11, 12, 22, 25, 34, 64, 90 };
        bubbleSort(array);
        System.out.println("Sorted array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}

// public class BubbleSort {
// //Worst case time complexity is O(n^2)
// public static void bubbleSort(int[] array) {
// int n = array.length;
// for (int i = 0; i < n - 1; i++) {
// for (int j = 0; j < n - i - 1; j++) {
// if (array[j] > array[j + 1]) {
// // Swap array[j] and array[j+1]
// int temp = array[j];
// array[j] = array[j + 1];
// array[j + 1] = temp;
// }
// }
// }
// }

// public static void main(String[] args) {
// int[] array = {64, 34, 25, 12, 22, 11, 90};
// bubbleSort(array);
// System.out.println("Sorted array:");
// for (int element : array) {
// System.out.print(element + " ");
// }
// }
// }
