package Arrays.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 6, 5, 4, 32, 1 };
        int[] sortedArr = sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] sort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return new int[] { arr[start] };
        }

        int mid = (start + end) / 2;

        int[] left = sort(arr, start, mid);
        int[] right = sort(arr, mid, end);

        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k++] = first[i++];
            } else {
                mix[k++] = second[j++];
            }
        }

        while (i < first.length) {
            mix[k++] = first[i++];
        }

        while (j < second.length) {
            mix[k++] = second[j++];
        }

        return mix;
    }
}