public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 2, 6, 8, 101, -1802 };
        System.out.println(even(arr));

    }

    public static int even(int[] arr) {
        int ref = 0;
        for (int element : arr) {
            // int noOfDigits = count(element);
            int noOfDigits = (int) Math.log10(Math.abs(element)) + 1; // much faster and optimised also In short: Yes —
                                                                      // the fact that 10^0 = 1 makes logs start at 0,
                                                                      // while digit-counting starts at 1. That’s why we
                                                                      // always need the +1.
            ref = noOfDigits % 2 == 0 ? ref + 1 : ref;
        }
        return ref;
    }

    public static int count(int element) {
        int n = Math.abs(element);
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}

// LEETCODE 1295