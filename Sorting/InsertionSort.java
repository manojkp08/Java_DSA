package Sorting;

public class InsertionSort {
    // Time complexity is O(n).
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = { 11, 12, 22, 25, 34, 64, 90 };
        insertionSort(array);
        System.out.println("Sorted array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}

// public class InsertionSort {
// //Worst case time complexity is O(n^2)
// public static void insertionSort(int[] array) {
// int n = array.length;
// for (int i = 1; i < n; i++) {
// int key = array[i];
// int j = i - 1;
// while (j >= 0 && array[j] > key) {
// array[j + 1] = array[j];
// j = j - 1;
// }
// array[j + 1] = key;
// }
// }

// public static void main(String[] args) {
// int[] array = {90, 64, 34, 25, 22, 12, 11};
// insertionSort(array);
// System.out.println("Sorted array:");
// for (int element : array) {
// System.out.print(element + " ");
// }
// }
// }
