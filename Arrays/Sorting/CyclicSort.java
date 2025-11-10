package Arrays.Sorting;

import java.util.Arrays;

/*
 * BEST  -> n
 * AVG   -> n
 * WORST -> n
 * NOT STABLE
 * NOT ADAPTIVE
 * In-place sorting algorithm
 * Works only when elements are in the range 1 to n (or 0 to n-1)
 * Places each element at its correct index by swapping
 * Very efficient for problems like finding missing or duplicate numbers
 */

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[correctIndex] != arr[i]) {
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }

        return arr.length > 0 ? arr : new int[] {};
    }
}
