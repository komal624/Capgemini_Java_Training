package DataStructures.runtimeanalysis.bigo;

import java.util.*;

public class SearchComparison {

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int N = 1_000_000;
        int[] data = new int[N];

        for (int i = 0; i < N; i++) {
            data[i] = i;
        }

        int target = N - 1;

        long start = System.nanoTime();
        linearSearch(data, target);
        long end = System.nanoTime();
        System.out.println("Linear Search Time (ns): " + (end - start));

        Arrays.sort(data);

        start = System.nanoTime();
        binarySearch(data, target);
        end = System.nanoTime();
        System.out.println("Binary Search Time (ns): " + (end - start));
    }
}
