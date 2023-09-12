package Basic_Java_Programs;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Insertion
        System.out.print("Enter the value to insert: ");
        int insertValue = scanner.nextInt();
        System.out.print("Enter the row index to insert at: ");
        int insertRowIndex = scanner.nextInt();
        System.out.print("Enter the column index to insert at: ");
        int insertColumnIndex = scanner.nextInt();

        if (insertRowIndex >= 0 && insertRowIndex < rows && insertColumnIndex >= 0 && insertColumnIndex < columns) {
            array[insertRowIndex][insertColumnIndex] = insertValue;
        } else {
            System.out.println("Insertion index out of bounds");
        }

        // Deletion
        System.out.print("Enter the row index to delete: ");
        int deleteRowIndex = scanner.nextInt();
        System.out.print("Enter the column index to delete: ");
        int deleteColumnIndex = scanner.nextInt();

        if (deleteRowIndex >= 0 && deleteRowIndex < rows && deleteColumnIndex >= 0 && deleteColumnIndex < columns) {
            array[deleteRowIndex][deleteColumnIndex] = 0;
        } else {
            System.out.println("Deletion index out of bounds");
        }

        // Print the updated 2D array
        System.out.println("Updated 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
