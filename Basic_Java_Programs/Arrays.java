package Basic_Java_Programs;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Insertion
        System.out.print("Enter the value to insert: ");
        int insertValue = scanner.nextInt();
        System.out.print("Enter the index to insert at: ");
        int insertIndex = scanner.nextInt();

        if (insertIndex >= 0 && insertIndex <= size) {
            int[] newArray = new int[size + 1];
            for (int i = 0, j = 0; i < newArray.length; i++) {
                if (i == insertIndex) {
                    newArray[i] = insertValue;
                } else {
                    newArray[i] = array[j];
                    j++;
                }
            }
            array = newArray;
            size++;
        } else {
            System.out.println("Insertion index out of bounds");
        }

        // Deletion
        System.out.print("Enter the index to delete: ");
        int deleteIndex = scanner.nextInt();

        if (deleteIndex >= 0 && deleteIndex < size) {
            int[] newArray = new int[size - 1];
            for (int i = 0, j = 0; i < size; i++) {
                if (i != deleteIndex) {
                    newArray[j] = array[i];
                    j++;
                }
            }
            array = newArray;
            size--;
        } else {
            System.out.println("Deletion index out of bounds");
        }

        // Print the updated array
        System.out.println("Updated array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
