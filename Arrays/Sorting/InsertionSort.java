package Arrays.Sorting;

import java.util.Arrays;

/*
 * BEST  -> n ,  AVG -> n^2 ,  WORST -> n^2
 * STABLE
 * ADAPTIVE (faster for nearly sorted arrays)
 * After every pass i, the first (i + 1) elements are sorted among themselves
 */

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 0, -1, 100, -88, -99 };
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }

        return arr.length > 0 ? arr : new int[] {};
    }
}
