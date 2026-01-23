package DataStructures.HashMaps;

import java.util.LinkedList;

public class MyHashMap {

    private static class Node {
        int key, value;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 10;
    private LinkedList<Node>[] buckets;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        for (Node node : buckets[index]) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }
        buckets[index].add(new Node(key, value));
    }

    public int get(int key) {
        int index = hash(key);
        for (Node node : buckets[index]) {
            if (node.key == key) {
                return node.value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        buckets[index].removeIf(node -> node.key == key);
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(1, 10);
        map.put(2, 20);
        map.put(12, 120); // Collision example

        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Value for key 12: " + map.get(12));

        map.remove(1);
        System.out.println("Value for key 1 after remove: " + map.get(1));
    }
}