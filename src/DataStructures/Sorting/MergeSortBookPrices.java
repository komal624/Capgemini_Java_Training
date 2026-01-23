package datastructures.sorting;

import java.util.Arrays;

public class MergeSortBookPrices {

    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);

            merge(prices, left, mid, right);
        }
    }

    private static void merge(int[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid; // ✅ FIXED

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = prices[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = prices[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                prices[k] = L[i];
                i++;
            } else {
                prices[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            prices[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            prices[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] prices = {450, 299, 799, 199, 999, 150};

        System.out.println("Before Sorting: " + Arrays.toString(prices));
        mergeSort(prices, 0, prices.length - 1);
        System.out.println("After Sorting:  " + Arrays.toString(prices));
    }
}

