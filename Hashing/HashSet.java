package Hashing;

import java.util.HashSet;

class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Mango");

        // Printing the HashSet
        System.out.println("HashSet: " + set);

        // Checking if an element exists in the HashSet
        String element = "Orange";
        if (set.contains(element)) {
            System.out.println(element + " is present in the HashSet");
        } else {
            System.out.println(element + " is not present in the HashSet");
        }

        // Removing an element from the HashSet
        String elementToRemove = "Grapes";
        boolean removed = set.remove(elementToRemove);
        if (removed) {
            System.out.println(elementToRemove + " is removed from the HashSet");
        } else {
            System.out.println(elementToRemove + " is not present in the HashSet");
        }

        // Printing the HashSet after removal
        System.out.println("Updated HashSet: " + set);
    }
}
