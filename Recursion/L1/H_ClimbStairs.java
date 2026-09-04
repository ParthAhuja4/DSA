/*
 * Question
 *
 * 1. You are given a number n representing number of stairs in a staircase.
 * 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in
 *    one move.
 */

package Recursion.L1;

import java.util.Scanner;
import java.util.ArrayList;

public class H_ClimbStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(climb(input));
        sc.close();
    }

    public static ArrayList<String> climb(int n) {

        if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        } else if (n < 0) {
            return new ArrayList<String>();
        }

        ArrayList<String> pathIfStep1 = climb(n - 1);
        ArrayList<String> pathIfStep2 = climb(n - 2);
        ArrayList<String> pathIfStep3 = climb(n - 3);

        ArrayList<String> ans = new ArrayList<>();

        for (String path : pathIfStep1) {
            ans.add("1" + path);
        }
        for (String path : pathIfStep2) {
            ans.add("2" + path);
        }
        for (String path : pathIfStep3) {
            ans.add("3" + path);
        }
        return ans;
    }
}
