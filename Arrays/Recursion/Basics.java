package Arrays.Recursion;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 4, 5 };
        int number = 123;
        String word = "happy";
        int reversed = reverse(number, 0);
        printrev(arr, 0);
        System.out.println("Reversed number: " + reversed);
        System.out.println("Palindrome : " + paliNo(number));
        System.out.println("Palindrome String : " + paliStr(word, 0));
        System.out.println(findAllIndex2(arr, 4, 0));
        System.out.println(reverseString(word, 0));
    }

    public static void printrev(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        printrev(arr, i + 1);
        System.out.println(arr[i]);
    }

    public static int reverse(int n, int rev) {
        // Base case
        if (n == 0)
            return rev;

        // Add last digit to rev and remove last digit from n
        return reverse(n / 10, rev * 10 + n % 10);
    }

    public static boolean paliNo(int n) {
        return n == reverse(n, 0);
    }

    public static boolean paliStr(String s, int i) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }

        return paliStr(s, i + 1);
    }

    public static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }

    public static String reverseString(String str, int i) {
        if (i == str.length()) {
            return "";
        }

        String ans = reverseString(str, i + 1) + str.charAt(i);

        return ans;
    }
}
