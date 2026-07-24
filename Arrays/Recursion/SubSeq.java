package Arrays.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

//subsets
public class SubSeq {
    public static void main(String[] args) {
        sub("", "abc");

        ArrayList<Integer> empty = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3));
        sub(empty, arr, 0);
    }

    // For Strings
    public static void sub(String l, String r) {
        if (r.isEmpty()) {
            System.out.println(l);
            return;
        }

        char curr = r.charAt(0);

        sub(l + curr, r.substring(1)); // include
        sub(l, r.substring(1)); // exclude
    }

    // For ArrayList<Integer>
    public static void sub(ArrayList<Integer> l, ArrayList<Integer> r, int i) {
        if (i == r.size()) {
            System.out.println(l);
            return;
        }

        int curr = r.get(i);

        // include current element
        ArrayList<Integer> left = new ArrayList<>(l);
        left.add(curr);
        sub(left, r, i + 1);

        // exclude current element
        sub(l, r, i + 1);
    }
}
