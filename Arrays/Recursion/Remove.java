package Arrays.Recursion;

public class Remove {
    public static void main(String[] args) {
        String str = "Paratahahahahaha";
        String removedStr = remove(str, 0);
        System.out.println(removedStr);
    }

    public static String remove(String str, int i) {
        if (i == str.length()) {
            return "";
        }

        char ch = str.charAt(i);

        String smallAns = remove(str, i + 1);

        if (ch != 'a') {
            return ch + smallAns;
        } else {
            return smallAns;
        }
    }
}
