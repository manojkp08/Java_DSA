package tutorial1.Recursion;
public class recursion8{
    static void fun1(){
        System.out.println("fun1");
    }
    static void fun2(){
        System.out.println("Before fun");
        fun1();
        System.out.println("After fun");
    }
    public static void main(String args[]){
        System.out.println("Before fun2");
        fun2();
        System.out.println("After fun2");
    }
}