package tutorial1.Basic_Java_Programs;
import java.util.*;
public class table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<11; i++){
            int table = n*i;
            System.out.println(table);
        }
    }
}