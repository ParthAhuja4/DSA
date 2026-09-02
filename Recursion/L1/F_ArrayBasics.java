package Recursion.L1;

public class F_ArrayBasics {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 45, 55, 100, 100, 3, 3 };
        System.out.println(max(arr, 0));
        System.out.println(firstOcc(arr, 0, 3));
        System.out.println(lastOcc(arr, 0, 3));

    }

    public static int max(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        int maxTillNow = max(arr, idx + 1);
        if (arr[idx] > maxTillNow) {
            return arr[idx];
        } else {
            return maxTillNow;
        }
    }

    public static int firstOcc(int[] arr, int idx, int x) {
        if (arr.length == idx) {
            return -1;
        }
        if (arr[idx] == x) {
            return idx;
        }
        int occur = firstOcc(arr, idx + 1, x);
        return occur;
    }

    public static int lastOcc(int[] arr, int idx, int x) {
        if (arr.length == idx) {
            return -1;
        }

        int occur = lastOcc(arr, idx + 1, x);
        if (occur != -1) {
            return occur;
        }

        if (arr[idx] == x) {
            return idx;
        }
        return -1;
    }

    public static int[] allIndices(int[] arr, int idx, int x, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }
        int[] ans;
        if (arr[idx] == x) {
            ans = allIndices(arr, idx + 1, x, fsf + 1);
            ans[fsf] = idx;
        } else {
            ans = allIndices(arr, idx + 1, x, fsf);
        }
        return ans;
    }
}
