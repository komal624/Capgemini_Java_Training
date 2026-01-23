package DataStructures.Sorting;

import java.util.Arrays;

public class HeapSortSalaryDemands {

    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap root (max) with last element
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Heapify reduced heap
            heapify(salaries, i, 0);
        }
    }

    private static void heapify(int[] arr, int size, int root) {
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != root) {
            int swap = arr[root];
            arr[root] = arr[largest];
            arr[largest] = swap;

            heapify(arr, size, largest);
        }
    }

    public static void main(String[] args) {
        int[] salaries = {50000, 70000, 45000, 90000, 60000, 75000};

        System.out.println("Before Sorting: " + Arrays.toString(salaries));
        heapSort(salaries);
        System.out.println("After Sorting:  " + Arrays.toString(salaries));
    }
}
