public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        int richest = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            richest = sum > richest ? sum : richest;
        }
        System.out.println(richest);
    }
}

// LEETCODE 1672