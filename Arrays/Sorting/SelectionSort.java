package Arrays.Sorting;

import java.util.Arrays;

/*
 * BEST  -> n^2 ,  AVG -> n^2 ,  WORST -> n^2
 * NOT STABLE
 * NOT ADAPTIVE
 * After every pass i, the (i + 1)-th smallest element settles at its correct position from the start of the array
 */

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 9, 7, 6, 1, 2 };
        System.out.println(Arrays.toString(selection(arr)));
    }

    static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
        return arr;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
