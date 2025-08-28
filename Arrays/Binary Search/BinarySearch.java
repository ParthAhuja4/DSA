//NEED SORTED ARRAY

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 9;
        System.out.println(search(target, arr));
    }

    public static boolean search(int target, int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2; // start + end might exceed max no integer can store so we do like this

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}