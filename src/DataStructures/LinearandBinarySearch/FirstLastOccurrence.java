package DataStructures.LinearandBinarySearch;

public class FirstLastOccurrence {

    static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1, res = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                res = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1, res = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                res = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        int target = 2;

        System.out.println(findFirst(arr, target));
        System.out.println(findLast(arr, target));
    }
}