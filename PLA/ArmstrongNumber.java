package PLA;

import java.util.*;

public class ArmstrongNumber {
    public static boolean isArmstrongNumber(int num) {
        int original_num = num;
        int n = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }

        return sum == original_num;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        boolean isArmstrongNum = isArmstrongNumber(num);

        if (isArmstrongNum) {
            System.out.println("The number " + num + " is an armstrong number.");
        } else {
            System.out.println("The number " + num + " is not an armstrong number.");
        }

    }
}
