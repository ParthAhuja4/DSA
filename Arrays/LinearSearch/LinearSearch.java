import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("ENTER TO FIND");
        int no = sc.nextInt();
        System.out.println(search(no, arr));
        sc.close();

    }

    public static boolean search(int no, int[] arr) {

        if (arr.length == 0) {
            return false;
        }

        for (int i : arr) {
            if (no == i) {
                return true;
            }
        }
        return false;
    }
}
