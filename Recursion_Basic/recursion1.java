// print numbers 5 to 1
package Recursion_Basic;

public class recursion1 {
    public static void printnum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printnum(n - 1);
    }

    public static void main(String args[]) {
        int n = 5;
        printnum(n); // n=5
    }
}