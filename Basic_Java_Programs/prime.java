package Basic_Java_Programs;

//printing prime numbers between 1 to 100
public class prime {
    public static void main(String[] args) {
        int i, j, count;
        System.out.println("Prime numbers between 1 to 100 are:");
        for (i = 1; i <= 100; i++) {
            count = 0;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && i != 1) {
                System.out.print(i + " ");
            }
        }
    }
}
