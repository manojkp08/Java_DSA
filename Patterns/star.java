package Patterns;

//printing star pattern
public class star {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 4; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // now the same thing but opposite size of the triangle
        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 4; i >= 1; i--) {
            for (j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // now with right side triangle
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (i = 4; i >= 1; i--) {
            for (j = 1; j <= 5; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // now with left side triangle
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (j >= 6 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (i = 4; i >= 1; i--) {
            for (j = 1; j <= 5; j++) {
                if (j >= 6 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
