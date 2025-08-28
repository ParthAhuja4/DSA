import java.util.Scanner;

public class StringsLS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Parth";
        System.out.println("ENTER ALPHABET");
        String input = sc.next();
        if (input.length() > 1) {
            System.out.println("ONLY ONE ALPHA");
            sc.close();
            return;
        }
        char alpha = input.charAt(0);
        System.out.println(stringLinearSearch(alpha, str));
        System.out.println(stringForEachLinearSearch(alpha, str));
        sc.close();
    }

    public static boolean stringLinearSearch(char alpha, String str) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == alpha) {
                return true;
            }
        }

        return false;
    }

    public static boolean stringForEachLinearSearch(char alpha, String str) {
        if (str.length() == 0) {
            return false;
        }

        // toCharArray converts string to array of characters

        for (char c : str.toCharArray()) {
            if (c == alpha) {
                return true;
            }
        }

        return false;
    }
}
