package Arrays.Sorting;

import java.util.Arrays;

/*
 * BEST  -> n log n
 * AVG   -> n log n
 * WORST -> n^2
 * NOT STABLE
 * NOT ADAPTIVE
 * Divide and Conquer algorithm
 * Uses a pivot element to partition the array into two halves
 * After every partition, the pivot element is placed in its correct sorted position
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 3, 6542, 65, 64, 1, 2 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = low + (high - low) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        sort(arr, low, end);
        sort(arr, start, high);
    }
}
