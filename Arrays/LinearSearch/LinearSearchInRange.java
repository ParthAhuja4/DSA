import java.util.Scanner;

public class LinearSearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("ENTER ELEMENTS IN SPACE SEPERATED FASHION");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("ENTER UPPER BOUND AND LOWER BOUND BOTH INCLUSIVE FOR SEARCHING IN SPACE SEPERATED FASHION");
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        System.out.println("Enter Target");
        int target = sc.nextInt();
        System.out.println(rangeLinearSearch(arr, lower, upper, target));
        sc.close();
    }

    public static boolean rangeLinearSearch(int[] arr, int lower, int upper, int target) {
        if (arr.length == 0) {
            return false;
        }

        try {
            for (int i = lower; i <= upper; i++) {
                if (arr[i] == target) {
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }

        return false;
    }
}
