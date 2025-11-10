package Arrays.Sorting;

import java.util.Arrays;

/*
 * BEST  -> O(n + k)
 * AVG   -> O(n + k)
 * WORST -> O(n + k)
 * STABLE (if implemented using prefix sums, as done here)
 * NOT ADAPTIVE
 * Non-comparison based sorting algorithm
 * Works only for integers (or data that can be mapped to integers)
 * Counts frequency of each element and places them in correct position using prefix sums
 */

public class CountSort {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 8, 22, 111 };
        int[] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sort(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return arr;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        int[] freqArrLaterPrefixSumOfFreq = new int[max - min + 1];
        for (int num : arr) {
            freqArrLaterPrefixSumOfFreq[num - min]++;
        }

        // prefix sum
        for (int i = 1; i < freqArrLaterPrefixSumOfFreq.length; i++) {
            freqArrLaterPrefixSumOfFreq[i] += freqArrLaterPrefixSumOfFreq[i - 1];
        }

        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[(freqArrLaterPrefixSumOfFreq[arr[i] - min]) - 1] = arr[i];
            // (freqArrLaterPrefixSumOfFreq[arr[i] - min]) gives the position in natural
            // number so we sub 1 for index based
            // https://youtu.be/9zppWXdJI2M?t=1825
            // https://drive.google.com/file/d/1dxv-x1xOAspFA4ASrfj12GBIIQUfEjKx/view?usp=sharing
            freqArrLaterPrefixSumOfFreq[arr[i] - min]--;
        }

        return ans;
    }
}
