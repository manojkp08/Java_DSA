//print number from 1 to 5.
package Recursion_Basic;

public class recursion2 {
    public static void printnum(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printnum(n + 1);
    }

    public static void main(String args[]) {
        int n = 1;
        printnum(n); // n = 5
    }
}