package DataStructures.HashMaps;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {

    public static boolean hasPair(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println("Pair found: " + num + " and " + complement);
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        System.out.println("Pair exists: " + hasPair(arr, target));
    }
}
