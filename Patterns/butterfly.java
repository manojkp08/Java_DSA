package Patterns;

//printing butterfly pattern using stars and spaces.
public class butterfly {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            // for spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int k = 0; k < 2 * (n - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            // for spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // In rotated form of butterfly pattern using stars and spaces.
    }
}
