package DataStructures.runtimeanalysis.bigo;


import java.util.*;

public class DataStructureSearch {

    public static void main(String[] args) {
        int N = 1_000_000;
        int target = N - 1;

        int[] arr = new int[N];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        long start, end;

        // Array Search
        start = System.nanoTime();
        for (int i : arr) {
            if (i == target) break;
        }
        end = System.nanoTime();
        System.out.println("Array Search Time (ns): " + (end - start));

        // HashSet Search
        start = System.nanoTime();
        hashSet.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet Search Time (ns): " + (end - start));

        // TreeSet Search
        start = System.nanoTime();
        treeSet.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time (ns): " + (end - start));
    }
}
