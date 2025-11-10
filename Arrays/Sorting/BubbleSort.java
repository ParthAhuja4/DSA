package Arrays.Sorting;

import java.util.Arrays;

/*
 * BEST -> n ,  AVG-> n^2 ,  WORST-> n^2
 * STABLE
 * CAN BE MADE ADAPTIVE BY ADDING THE SWAPPED FLAG (SEE BELOW)
 * After every pass i, the (i + 1)-th largest element settles at its correct position from the end of the array
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 0, -1, 100, -88, -99 };
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr) {
        boolean swapped = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) { // < asc , > dsc
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted
            // hence stop the program
            if (!swapped) {
                return arr;
            }
        }

        return arr.length > 0 ? arr : new int[] {};
    }
}
