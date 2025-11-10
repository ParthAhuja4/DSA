package Arrays.Sorting;

import java.util.Arrays;

/*
 * BEST  -> n log n
 * AVG   -> n log n
 * WORST -> n log n
 * STABLE
 * NOT ADAPTIVE
 * Divide and Conquer algorithm
 * Recursively splits the array into halves and merges them in sorted order
 * Requires O(n) extra space for merging
 */

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 6, 5, 4, 32, 1 };
        int[] sortedArr = sort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

}
