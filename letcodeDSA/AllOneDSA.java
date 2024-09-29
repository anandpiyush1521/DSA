/*
    Design a data structure to store the strings' count with the ability to return the strings with minimum and maximum counts.

    Implement the AllOne class:

    1. AllOne() Initializes the object of the data structure.
    2. inc(String key) Increments the count of the string key by 1. If key does not exist in the data structure, insert it with count 1.
    3. dec(String key) Decrements the count of the string key by 1. If the count of key is 0 after the decrement, remove it from the data structure. It is guaranteed that key exists in the data structure before the decrement.
    4. getMaxKey() Returns one of the keys with the maximal count. If no element exists, return an empty string "".
    5. getMinKey() Returns one of the keys with the minimum count. If no element exists, return an empty string "".
    
    Note that each function must run in O(1) average time complexity.

 */

import java.util.*;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(key, pair.key) && Objects.equals(value, pair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

class AllOne {

    private Map<String, Integer> count;
    private TreeSet<Pair<Integer, String>> set;

    public AllOne() {
        count = new HashMap<>();
        set = new TreeSet<>((a, b) -> a.getKey().equals(b.getKey()) ? a.getValue().compareTo(b.getValue()) : a.getKey() - b.getKey());
    }

    public void inc(String key) {
        int n = count.getOrDefault(key, 0);
        count.put(key, n + 1);
        set.remove(new Pair<>(n, key)); // Remove the old pair (n, key) from the set
        set.add(new Pair<>(n + 1, key)); // Add the new pair (n+1, key) to the set
    }

    public void dec(String key) {
        if (!count.containsKey(key)) return;

        int n = count.get(key);
        set.remove(new Pair<>(n, key)); // Remove the current pair (n, key)
        if (n == 1) {
            count.remove(key); // If n == 1, remove the key from the count map
        } else {
            count.put(key, n - 1); // Otherwise, decrement the count
            set.add(new Pair<>(n - 1, key)); // Add the updated pair (n-1, key)
        }
    }

    public String getMaxKey() {
        return set.isEmpty() ? "" : set.last().getValue(); // Return the key with the highest count
    }

    public String getMinKey() {
        return set.isEmpty() ? "" : set.first().getValue(); // Return the key with the lowest count
    }
}

public class AllOneDSA {

    public static void main(String[] args) {
        AllOne allOne = new AllOne();

        allOne.inc("apple");
        allOne.inc("banana");
        allOne.inc("apple");
        allOne.inc("cherry");
        allOne.inc("banana");
        allOne.inc("cherry");
        allOne.inc("banana");

        System.out.println("Max Key: " + allOne.getMaxKey()); // Should return "banana"
        System.out.println("Min Key: " + allOne.getMinKey()); // Should return "apple" or "cherry"

        allOne.dec("banana");
        allOne.dec("banana");

        System.out.println("After decrementing banana twice");
        System.out.println("Max Key: " + allOne.getMaxKey()); // Should return "apple" or "cherry"
        System.out.println("Min Key: " + allOne.getMinKey()); // Should return "apple" or "banana"
    }
}
