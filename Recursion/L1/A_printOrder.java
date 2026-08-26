package Recursion.L1;

import java.util.Scanner;

public class A_printOrder {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number");
            int n = sc.nextInt();
            printInc(n);
            printDec(n);
        }
    }

    public static void printInc(int n) {
        if (n < 1) {
            return;
        }
        printInc(n - 1);
        System.out.println(n);
    }

    public static void printDec(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printDec(n - 1);
    }
}
