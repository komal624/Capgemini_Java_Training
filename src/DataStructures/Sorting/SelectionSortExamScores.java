package DataStructures.Sorting;

import java.util.Arrays;

public class SelectionSortExamScores {

    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find minimum in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {78, 92, 85, 64, 90, 71};

        System.out.println("Before Sorting: " + Arrays.toString(scores));
        selectionSort(scores);
        System.out.println("After Sorting:  " + Arrays.toString(scores));
    }
}