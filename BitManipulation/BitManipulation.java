package BitManipulation;

import java.util.Scanner;

public class BitManipulation {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int oper = sc.nextInt();
            int n = 5; // 0101 --> 0111(7)
            int pos = 1;
            int bitMask = 1 << pos;
            if (oper == 1) {
                // We will perform Set Bit operation
                int newnum = bitMask | n;
                System.out.println(newnum);
            } else {
                // We will perform Clear Bit Operation
                int newbitMask = ~(bitMask);
                int newnum = newbitMask & n;
                System.out.println(newnum);
            }
        }
    }
}
