package Patterns;

//pyramid pattern using stars
class star {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            // for spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}