// Now lets see an example code of abstraction in java

import java.math.BigInteger;

class test2 {

    public static int solveCRT(int[] residues, int[] moduli) {
        int M = 1;
        for (int modulus : moduli) {
            M *= modulus;
        }

        int result = 0;
        for (int i = 0; i < residues.length; i++) {
            int Mi = M / moduli[i];
            int MiInverse = findInverse(Mi, moduli[i]);
            result += residues[i] * Mi * MiInverse;
        }

        return result % M;
    }

    public static int findInverse(int a, int m) {
        a = a % m;
        for (int i = 1; i < m; i++) {
            if ((a * i) % m == 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] residues = { 2, 3, 2 };
        int[] moduli = { 3, 5, 7 };

        System.out.println("x = " + solveCRT(residues, moduli));
    }
}