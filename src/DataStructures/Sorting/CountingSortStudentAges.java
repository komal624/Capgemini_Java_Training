package DataStructures.Sorting;

import java.util.Arrays;

public class CountingSortStudentAges {

    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;

        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        int[] output = new int[ages.length];

        // Count frequency
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Cumulative count
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build output array (stable sort)
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int index = count[age - minAge] - 1;
            output[index] = age;
            count[age - minAge]--;
        }

        // Copy back
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 18, 14, 13, 17, 11, 16};

        System.out.println("Before Sorting: " + Arrays.toString(ages));
        countingSort(ages);
        System.out.println("After Sorting:  " + Arrays.toString(ages));
    }
}
