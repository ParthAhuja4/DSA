public class CielAndFloor {
    public static void main(String[] args) {
        int[] sortedArr = { 0, 1, 2, 3, 5, 6, 8 };
        int target = 7;
        System.out.println(cieling(target, sortedArr));
        System.out.println(floor(target, sortedArr));
    }

    public static int cieling(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        // int c = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
                // c = arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return target;
            }
        }
        return target > arr[arr.length - 1] ? -1 : arr[start];
    }

    public static int floor(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        // int c = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
                // c = arr[mid];
            } else {
                return target;
            }
        }
        return target < arr[arr.length - 1] ? -1 : arr[end];
    }
}
