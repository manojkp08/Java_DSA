package tutorial1.Recursion;

public class recursion7 {
    private static int output;

    public static int printpw(int x, int n){
        if(n == 0){
            return 1;
        }
        if(n % 2 == 0){
            return printpw(x, n/2) * printpw(x, n/2);
        }
        else{
            return x * printpw(x, n/2) * printpw(x, n/2)
        }
    }

    public static void main(String args[]) {
        int x = 6, n = 7;
        output = printpw(x, n);
        System.out.println("The output is: " + output);
    }
}