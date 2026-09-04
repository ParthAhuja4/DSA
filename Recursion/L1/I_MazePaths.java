package Recursion.L1;

import java.util.ArrayList;

public class I_MazePaths {
    public static void main(String[] args) {
        System.out.println(findPaths(0, 0, 2, 2));
    }

    public static ArrayList<String> findPaths(int sr, int sc, int dr, int dc) {
        if (dr == sr && dc == sc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> hMovePaths = new ArrayList<>();
        ArrayList<String> vMovePaths = new ArrayList<>();
        if (sc < dc) {
            hMovePaths = findPaths(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            vMovePaths = findPaths(sr + 1, sc, dr, dc);
        }

        ArrayList<String> ans = new ArrayList<>();

        for (String hPaths : hMovePaths) {
            ans.add("h" + hPaths);
        }
        for (String vPaths : vMovePaths) {
            ans.add("v" + vPaths);
        }

        return ans;
    }
}
