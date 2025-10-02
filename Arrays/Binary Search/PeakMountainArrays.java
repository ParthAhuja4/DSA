public class PeakMountainArrays {
    public static void main(String[] args) {
        int[] mountainArr = { 0, 1, 2, 3, 4, 5, 3, 2, 1 };
        System.out.println(peakOfMountainArr(mountainArr));
    }

    static int peakOfMountainArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
