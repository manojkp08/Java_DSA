package PLA;


// Now we will find the first palindrome string after the given string.

// public class LexNextPalindrome {
//     public static boolean isPalindrome(String s) {
//         int n = s.length();
//         for (int i = 0; i < n/2; i++) {
//             if (s.charAt(i) != s.charAt(n - i - 1)) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String args[]){
//         String s = "abbbabab";
//         Boolean result = isPalindrome(s);
//         System.out.println(result);
//     }
// }


// Code for lexiographically next palindrome string

public class LexNextPalindrome {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n/2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String nextPalindrome(String s) {
        int n = s.length();
        if (n == 0) {
            return "a";
        }
        if (n == 1) {
            return (char)(s.charAt(0) + 1) + "";
        }
        if (isPalindrome(s)) {
            return nextPalindrome(s.substring(0, n - 1)) + "a";
        }
        char[] c = s.toCharArray();
        for (int i = 0; i < n/2; i++) {
            if (c[i] != c[n - i - 1]) {
                if (c[i] < c[n - i - 1]) {
                    c[i] = c[n - i - 1];
                } else {
                    c[n - i - 1] = c[i];
                }
            }
        }
        return new String(c);
    }

    public static void main(String args[]){
        String s = "abbbabab";
        String result = nextPalindrome(s);
        System.out.println(result);
    }
}
