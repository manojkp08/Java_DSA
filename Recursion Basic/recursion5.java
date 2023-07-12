package tutorial1.Recursion;
//print first 10 fibonacci number
public class recursion5{
    public static void fibonacci(int a, int b, int n){
        if(n == 0){
            return;
        }
        System.out.println(a);
        fibonacci(b, a+b, n-1);
    }
    public static void main(String args[]){
        fibonacci(0, 1, 10);
    }
}