package data_structure_implementation;

import java.util.ArrayList;
import java.util.List;

// K -> Key
// V -> Value
class OurHashMap<K, V> {
    private List<MapNode<K, V>> bucket;
    private int capacity; // length of the bucket
    private int size; // number of elements in the map
    private final int INITIAL_CAPACITY = 5; // initial length of the bucket array

    public OurHashMap() {
        bucket = new ArrayList<>();
        capacity = INITIAL_CAPACITY;
        for (int i = 0; i < capacity; i++) {
            bucket.add(null);
        }
    }

    private int getBucketIndex(K key) {
        // Get the memory address of the object
        int hashCode = key.hashCode();
        return hashCode % capacity;
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = bucket.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = bucket.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size += 1;
        MapNode<K, V> newEntry = new MapNode<K, V>(key, value);
        head = bucket.get(bucketIndex);
        newEntry.next = head;
        bucket.set(bucketIndex, newEntry);

        // n : number of entries in the whole bucket i.e size in this case
        // b : bucket size i.e capacity in this case
        // (n/b) is called load factor and it should be always less than 0.75.
        double loadFactor = (1.0 * size) / capacity;
        System.out.println("Inserting Key : " + key);
        System.out.println("Load Factor : " + loadFactor);
        if (loadFactor > 0.75) {
            rehash();
        }
    }

    private void rehash() {
        System.out.println("Rehashing Buckets");
        List<MapNode<K, V>> temp = bucket;
        bucket = new ArrayList<>();
        capacity *= 2;
        for (int i = 0; i < capacity; i++) {
            bucket.add(null);
        }
        size = 0;
        for (MapNode<K, V> head : temp) {
            while (head != null) {
                put(head.key, head.value);
                head = head.next;
            }
        }
    }

    public void remove(K key) {
        int bucketindex = getBucketIndex(key);
        MapNode<K, V> head = bucket.get(bucketindex);
        MapNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    bucket.set(bucketindex, head.next);
                } else {
                    prev.next = head.next;
                }
                head.next = null;
                size -= 1;
                break;
            }
            prev = head;
            head = head.next;
        }
    }

    private static class MapNode<K, V> {
        K key;
        V value;
        MapNode<K, V> next;

        public MapNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

public class HashMapImplementation {
    public static void main(String[] args) {
        OurHashMap<Integer, String> hashMap = new OurHashMap<Integer, String>();
        hashMap.put(1, "A");
        hashMap.put(5, "LALIT");
        hashMap.put(7, "SIRASWA");
        hashMap.put(5, "ABCDE");
        hashMap.put(3, "ABC");
        System.out.println(hashMap.get(5));
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(3));
        System.out.println(hashMap.get(7));
        System.out.println(hashMap.get(4));
    }
}
