package PLA;

// Sorted unique permutation of a String. We will use hashset to store the unique permutations.

public class AllPermutations {
    public static void permute(String s, String ans, HashSet<String> set) {
        if (s.length() == 0) {
            set.add(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String ros = s.substring(0, i) + s.substring(i + 1);
            permute(ros, ans + ch, set);
        }
    }

    public static void main(String args[]) {
        String s = "abc";
        HashSet<String> set = new HashSet<>();
        permute(s, "", set);
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list);
        for (String str : list) {
            System.out.println(str);
        }
    }
}
