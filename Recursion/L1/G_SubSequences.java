package Recursion.L1;

import java.util.ArrayList;
import java.util.Scanner;

public class G_SubSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(generateSubsequences(input));
        sc.close();
    }

    public static ArrayList<String> generateSubsequences(String input) {
        // Base case: empty string has exactly one subsequence — the empty string
        if (input.length() == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char firstChar = input.charAt(0);
        String remaining = input.substring(1);

        // Recursive step: get all subsequences of the rest of the string
        ArrayList<String> subsequencesOfRemaining = generateSubsequences(remaining);

        ArrayList<String> result = new ArrayList<>();

        // Option 1: subsequences that exclude firstChar
        for (String subsequence : subsequencesOfRemaining) {
            result.add(subsequence);
        }

        // Option 2: subsequences that include firstChar (prepended)
        for (String subsequence : subsequencesOfRemaining) {
            result.add(firstChar + subsequence);
        }

        return result;
    }
}
