package Searching;

public class Q1672_MaximumWealth {
    public static void main(String[] args) {
        int[][] account = {
                {5,6,4},
                {7,8,2,1},
                {2,1}
        };
        System.out.println(maximumWealth(account));
    }
    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int row = 0; row < accounts.length; row++){
            int sum = 0;
            for(int col = 0; col < accounts[row].length; col++){
               sum += accounts[row][col];
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
