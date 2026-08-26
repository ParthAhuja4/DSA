package Recursion.L1;

import java.util.Scanner;

public class C_factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number");
            int n = sc.nextInt();
            System.out.println(fact(n));
        }
    }

    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
