// 1. There are 3 towers. Tower 1 has n disks, where n is a positive number. Tower 2 and 3 are empty.
// 2. The disks are increasingly placed in terms of size such that the smallest disk is on top and largest disk is at bottom. 
// 3. You are required to :
//      3.1. Print the instructions to move the disks 
//      3.2. from tower 1 to tower 2 using tower 3
//      3.3. following the rules 
//          3.3.1 move 1 disk at a time
//          3.3.2 never place a smaller disk under a larger disk 
//          3.3.3 you can only move a disk at the top 

package Recursion.L1;

import java.util.Scanner;

public class E_TowerOfHanoi {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of disks");
            int n = sc.nextInt();
            toh(n, 1, 2, 3);
        }
    }

    public static void toh(int disks, int tow1, int tow2, int tow3) {
        if (disks == 0) {
            return;
        }
        toh(disks - 1, tow1, tow3, tow2);
        System.out.println(tow1 + "->" + tow2);
        toh(disks - 1, tow3, tow2, tow1);
    }
}
