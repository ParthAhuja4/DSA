public class Search2D {
    public static void main(String[] args) {
        int[][] arr2D = { { 23, 4, 1 }, { 1, 2, 3 }, { 11, 12, 15 } };
        int target = 10;
        System.out.println(search(target, arr2D));
    }

    public static int search(int target, int[][] arr) {
        if (arr.length == 0) {
            return -1;
        }
        for (int[] element : arr) {
            for (int subElement : element) {
                if (subElement == target) {
                    return target;
                }
            }
        }
        return -1;
    }
}
