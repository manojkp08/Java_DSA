package Hashing;

import java.util.HashMap;

class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(4, "Grapes");
        map.put(5, "Mango");

        // Printing the HashMap
        System.out.println("HashMap: " + map);

        // Checking if a key exists in the HashMap
        int key = 3;
        if (map.containsKey(key)) {
            System.out.println("Key " + key + " is present in the HashMap with value: " + map.get(key));
        } else {
            System.out.println("Key " + key + " is not present in the HashMap");
        }

        // Removing a key-value pair from the HashMap
        int keyToRemove = 4;
        String removedValue = map.remove(keyToRemove);
        if (removedValue != null) {
            System.out.println("Key " + keyToRemove + " with value " + removedValue + " is removed from the HashMap");
        } else {
            System.out.println("Key " + keyToRemove + " is not present in the HashMap");
        }

        // Printing the HashMap after removal
        System.out.println("Updated HashMap: " + map);
    }
}
