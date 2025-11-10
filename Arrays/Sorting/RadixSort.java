package Arrays.Sorting;

import java.util.Arrays;

/*
 * BEST  -> O(n * k)
 * AVG   -> O(n * k)
 * WORST -> O(n * k)
 * STABLE (since each count sort pass uses prefix sums)
 * NOT ADAPTIVE
 * Non-comparison based sorting algorithm
 * Works only for integers (or data that can be represented as integers)
 * Works by sorting numbers digit by digit (least significant digit first)
 */

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int[] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(num, max);
        }

        // Apply counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            arr = countSort(arr, exp);
        }

        return arr;
    }

    // Stable counting sort for a specific digit (LSD)
    private static int[] countSort(int[] arr, int exp) {
        int[] freqArrLaterPrefixSumOfFreq = new int[10]; // digits 0–9

        // frequency count for current digit
        for (int num : arr) {
            int digit = (num / exp) % 10;
            freqArrLaterPrefixSumOfFreq[digit]++;
        }

        // prefix sum (for stability)
        for (int i = 1; i < 10; i++) {
            freqArrLaterPrefixSumOfFreq[i] += freqArrLaterPrefixSumOfFreq[i - 1];
        }

        int[] ans = new int[arr.length];

        // place elements in stable manner (right-to-left)
        for (int i = arr.length - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            ans[freqArrLaterPrefixSumOfFreq[digit] - 1] = arr[i];
            freqArrLaterPrefixSumOfFreq[digit]--;
        }

        return ans;
    }
}
