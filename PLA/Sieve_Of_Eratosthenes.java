package PLA;

public class Sieve_Of_Eratosthenes {
    public static void main(String[] args) {
        int n = 200;
        boolean[] prime = new boolean[n+1];
        for(int i = 2; i <= n; i++) {
            prime[i] = true;
        }

        for(int p = 2; p*p <= n; p++) {
            if(prime[p]) {
                for(int i = p*p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        System.out.println("Prime numbers below 200 are:");
        for(int i = 2; i <= n; i++) {
            if(prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

