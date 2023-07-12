package tutorial1.Recursion_Intermidiate;

public class ReverseString {
    public static String revString(String str){
        if(str.length() == 1){
            return str;
        }

        char currChar = str.charAt(0);
        String nextstring = revString(str.substring(1));
        return nextstring + currChar;
    }

    public static void main(String args[]){
        String str = "Manoj";
        String reversed = revString(str);
        System.out.println(reversed);
    }
}
