package PLA;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in Fibonacci series: ");
        int numElements = scanner.nextInt();

        int[] fibonacciSeries = generateFibonacci(numElements);

        System.out.print("Fibonacci Series: ");
        for (int num : fibonacciSeries) {
            System.out.print(num + " ");
        }
    }

    public static int[] generateFibonacci(int n) {
        int[] fibSeries = new int[n];
        if (n >= 1) {
            fibSeries[0] = 0;
        }
        if (n >= 2) {
            fibSeries[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
        }
        return fibSeries;
    }
}

// Recursive Approach

// public class Fibonacci {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter the number of elements in Fibonacci series: ");
// int numElements = scanner.nextInt();

// System.out.print("Fibonacci Series: ");
// for (int i = 0; i < numElements; i++) {
// System.out.print(fibonacci(i) + " ");
// }
// }

// public static int fibonacci(int n) {
// if (n <= 1) {
// return n;
// } else {
// return fibonacci(n - 1) + fibonacci(n - 2);
// }
// }
// }
