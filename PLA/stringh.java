package PLA;

public class stringh {
    // move all the hiphen in a given string to the front

    public static String moveHiphen(String s){
        String result = "";
        String hiphen = "";
        for (i=0; i<s.length(); i++){
            if(s.charAt(i) == "-"){
                hiphen += "-";
            }
            else {
                result += s.charAt(i);
            }
        }

        return hiphen+result;
    }

    public static void main(String args[]){
        String s = "kec-nekcnfoej-fceonp-c----fcnkrno";
        String f = moveHiphen(s);
        System.out.println(f);
    }
}
