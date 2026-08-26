package Recursion.L1;

import java.util.Scanner;

public class D_power {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number");
            int x = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(power(x, n));
            System.out.println(powerLOG(x, n));
        }
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    // 1. You are given a number x. 2. You are given another number n. 3. You are
    // required to calculate x raised to the power n. Don't change the signature of
    // power function
    // Notel -> The previous version expects the call stack to be of n height. This
    // function expects call function to be only log(n) high

    public static int powerLOG(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int xn = powerLOG(x, n / 2);
        xn = xn * xn;
        if (n % 2 == 1) {
            xn = xn * x;
        }
        return xn;
    }
}
// assuming that n will be positive if its not make it pos n shift x->1/x