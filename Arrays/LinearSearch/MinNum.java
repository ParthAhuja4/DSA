import java.util.ArrayList;
import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(20);
        System.out.println("ENTER 10 ELEMENTS IN SPACE SEPARATED FASHION");

        for (int i = 0; i < 10; i++) {
            int no = sc.nextInt();
            arr.add(no); // use add, not set as array size is still 0 even if u gave initialCapacity
        }
        System.out.println(min(arr));
        sc.close();
    }

    public static int min(ArrayList<Integer> arr) {
        int ref = arr.get(0);
        for (int element : arr) {
            if (element < ref) {
                ref = element;
            }
        }
        return ref;
    }

}
