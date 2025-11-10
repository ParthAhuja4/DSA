package Arrays;

import java.util.Arrays;

//TO FIND SUB ARRAY

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = { 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(arr));
    }

    public static int[] maxSubArrayList(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        int start = 0;
        int bestStart = 0;
        int bestEnd = 0;

        for (int i = 0; i < nums.length; i++) {
            // If starting new subarray is better
            if (nums[i] > sum + nums[i]) {
                sum = nums[i];
                start = i; // start a new subarray here
            } else {
                sum = sum + nums[i]; // continue previous subarray
            }

            // Update best subarray if needed
            if (sum > maxSum) {
                maxSum = sum;
                bestStart = start;
                bestEnd = i;
            }
        }

        // Extract the subarray
        return Arrays.copyOfRange(nums, bestStart, bestEnd + 1);
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}