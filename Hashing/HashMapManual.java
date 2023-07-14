package Hashing;

class Entry<K, V> {
    K key;
    V value;
    Entry<K, V> next;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class HashMapManual<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private Entry<K, V>[] table;
    private int size;

    public HashMapManual() {
        table = new Entry[DEFAULT_CAPACITY];
        size = 0;
    }

    private int getHash(K key) {
        return key.hashCode() % DEFAULT_CAPACITY;
    }

    public void put(K key, V value) {
        int index = getHash(key);
        Entry<K, V> newEntry = new Entry<>(key, value);

        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            Entry<K, V> current = table[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                current.value = value;
            } else {
                current.next = newEntry;
            }
        }
        size++;
    }

    public V get(K key) {
        int index = getHash(key);
        Entry<K, V> current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = getHash(key);
        Entry<K, V> current = table[index];
        Entry<K, V> previous = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public boolean containsKey(K key) {
        int index = getHash(key);
        Entry<K, V> current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        HashMapManual<Integer, String> map = new HashMapManual<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(4, "Grapes");
        map.put(5, "Mango");

        System.out.println("Value for key 3: " + map.get(3));
        System.out.println("Contains key 4: " + map.containsKey(4));

        map.remove(4);

        System.out.println("Updated size: " + map.size());
        System.out.println("Contains key 4: " + map.containsKey(4));
    }
}
